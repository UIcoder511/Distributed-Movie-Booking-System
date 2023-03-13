package servers.Outremont;

import static utils.UDPSendRecieve.recieveUDPMessages;
import static utils.UDPSendRecieve.sendUDPMessages;


import java.io.File;
import java.io.IOException;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import servers.TheatreImplementation;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class OutremontTheatre extends TheatreImplementation {

  private static final String LOGS_DIR =
    System.getProperty("user.dir") + "\\src\\servers\\Outremont";
  private static Logger logger;

  public OutremontTheatre() {
    super(logger);
  }

  public static void main(String[] args) {
    OutremontTheatre outremontTheatre;
    try {
      addLogger();


      outremontTheatre = new OutremontTheatre();
      Endpoint endpoint = Endpoint.publish("http://localhost:9999/outremont",outremontTheatre);
      System.out.println("outremontTheatre service is published: " + endpoint.isPublished());
      // wait for invocations from clients

      (
        new Thread(
          new Runnable() {
            @Override
            public void run() {

              System.out.println("outremontTheatre UDP ruuning 9999 ");
              recieveUDPMessages(outremontTheatre, 9999, logger);
            }
          }
        )
      ).start();


    } catch (Throwable t) {
      t.printStackTrace();
    }
  }

  public static void addLogger() {
    logger = Logger.getLogger(OutremontTheatre.class.getName());
    logger.setUseParentHandlers(false);
    try {
      System.out.println(LOGS_DIR + "\\logs.txt");
      File directory = new File(LOGS_DIR);
      if (!directory.exists()) {
        directory.mkdir();
      }
      directory = new File(LOGS_DIR + "\\logs.txt");
      directory.createNewFile();

      FileHandler fh = new FileHandler(directory.getAbsolutePath());
      logger.addHandler(fh);
      SimpleFormatter formatter = new SimpleFormatter();
      fh.setFormatter(formatter);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void addTestData() {
    addMovieSlotInHashMap("Avatar", "OUTE0100223", 15);
    addMovieSlotInHashMap("Avengers", "OUTM140223", 45);
    addMovieSlotInHashMap("Avengers", "OUTM150223", 35);
    addMovieSlotInHashMap("Avatar", "OUTA150223", 65);
    addMovieSlotInHashMap("Avatar", "OUTE160223", 85);
    addMovieSlotInHashMap("Titanic", "OUTE160223", 45);
    addMovieSlotInHashMap("Titanic", "OUTE150223", 55);
  }

  @Override
  public String listMovieShowsAvailability(String movieName) {
    String result = "";
    String resultFromATW = sendUDPMessages(7777, "GET_SHOWS-" + movieName);
    String resultFromVer = sendUDPMessages(8888, "GET_SHOWS-" + movieName);
    String resultLocal = super.listMovieShowsAvailability(movieName);
    String joined = Stream
      .of(resultLocal, resultFromATW, resultFromVer)
      .filter(s -> s != null && !s.isEmpty())
      .collect(Collectors.joining(","));
    if (joined.isEmpty()) result = ""; else result = movieName + ":" + joined;

    utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage(
      "listMovieShowsAvailability",
      "movieName : " + movieName,
      "Operation Sucessful",
      result
    );

    logger.log(Level.INFO, msg.toString());

    return result;
  }

  @Override
  public synchronized String bookMovieTickets(
    String customerID,
    String movieID,
    String movieName,
    int numberOfTickets
  ) {
    String res = super.bookMovieTickets(
      customerID,
      movieID,
      movieName,
      numberOfTickets
    );
    String movieInServer = movieID.substring(0, 3);
    if (res.equals("SEND_TO_SERVERS")) {
      String propToSend =
        "BOOK_TICKETS-" +
        customerID +
        "," +
        movieID +
        "," +
        movieName +
        "," +
        numberOfTickets;
      switch (movieInServer) {
        case "VER":
          res = sendUDPMessages(8888, propToSend);
          break;
        case "ATW":
          res = sendUDPMessages(7777, propToSend);
          break;
      }

      if (res.equals("Booking successful")) {
        //                utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage("bookMovieTickets", "customerID : " + customerID + ", movieID: " + movieID + ", movieName: " + movieName + ", numberOfTickets: " + numberOfTickets, "Operation Sucessful", res);
        //                logger.log(Level.INFO, msg.toString());
        addCustomerMovieCount(customerID, movieName, movieID, numberOfTickets);
      }
    }
    return res;
  }

  @Override
  public String exchangeTickets(
          String customerID,
          String movieID,
          String newMovieID,
          String oldMovieName,
          String movieName,
          int numberOfTickets
  ) {
    String res = super.exchangeTickets(
            customerID,
            movieID,
            newMovieID,
            oldMovieName,
            movieName,
            numberOfTickets
    );
    if (res.equals("")) {
      String bookingFnRes = bookMovieTickets(
              customerID,
              newMovieID,
              movieName,
              numberOfTickets
      );
      if (bookingFnRes.equals("Booking successful")) {
        String cancelTicketsRes = cancelMovieTickets(
                customerID,
                movieID,
                oldMovieName,
                numberOfTickets
        );
        if (cancelTicketsRes.equals("tickets cancelled successfully")) {
          res = "successfully exchanged tickets";
          utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage(
                  "exchangeTickets",
                  "customerID : " +
                          customerID +
                          ", movieID: " +
                          movieID +
                          ", newMovieID: " +
                          newMovieID +
                          ", oldMovieName: " +
                          oldMovieName +
                          ", movieName: " +
                          movieName +
                          ", numberOfTickets: " +
                          numberOfTickets,
                  "Success",
                  res
          );

          logger.log(Level.INFO, msg.toString());
        } else {
          cancelMovieTickets(
                  customerID,
                  newMovieID,
                  movieName,
                  numberOfTickets
          );

          res = "Failed to exchange tickets";
          utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage(
                  "exchangeTickets",
                  "customerID : " +
                          customerID +
                          ", movieID: " +
                          movieID +
                          ", newMovieID: " +
                          newMovieID +
                          ", oldMovieName: " +
                          oldMovieName +
                          ", movieName: " +
                          movieName +
                          ", numberOfTickets: " +
                          numberOfTickets,
                  "Error",
                  res
          );

          logger.log(Level.SEVERE, msg.toString());
        }
      } else {
        res = bookingFnRes;
        utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage(
                "exchangeTickets",
                "customerID : " +
                        customerID +
                        ", movieID: " +
                        movieID +
                        ", newMovieID: " +
                        newMovieID +
                        ", oldMovieName: " +
                        oldMovieName +
                        ", movieName: " +
                        movieName +
                        ", numberOfTickets: " +
                        numberOfTickets,
                "Error",
                res
        );

        logger.log(Level.SEVERE, msg.toString());
      }
    }

    return res;
  }
  //    public String getCustomerTicketsInOtherTheatres(String customerID) {
  //        String result = "";
  //        String resultFromATW = sendUDPMessages(7777, "GET_TICKETS-" + customerID);
  //        String resultFromVer = sendUDPMessages(8888, "GET_TICKETS-" + customerID);
  //        String joined =
  //                Stream.of(resultFromATW, resultFromVer)
  //                        .filter(s -> s != null && !s.isEmpty())
  //                        .collect(Collectors.joining(","));
  //        if (joined.isEmpty()) result = "";
  //        else result = joined;
  //
  //        utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage("getCustomerTicketsInOtherTheatres", "customerID : " + customerID, "Operation Sucessful", result);
  //
  //        logger.log(Level.INFO, msg.toString());
  //
  //        return result;
  //    }
  //
  //    @Override
  //    public synchronized String getBookingSchedule(String customerID) {
  //        String result = Stream.of(getCustomerTicketsInCurrentTheatre(customerID), getCustomerTicketsInOtherTheatres(customerID))
  //                .filter(s -> s != null && !s.isEmpty())
  //                .collect(Collectors.joining(","));
  //        utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage("getBookingSchedule", "customerID : " + customerID, "Operation Sucessful", result);
  //
  //        logger.log(Level.INFO, msg.toString());
  //        return result;
  //    }
}
