package servers.Verdun;

import servers.Atwater.AtwaterTheatre;
import servers.TheatreImplementation;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static utils.UDPSendRecieve.recieveUDPMessages;
import static utils.UDPSendRecieve.sendUDPMessages;

public class VerdunTheatre extends TheatreImplementation {
    private static final String LOGS_DIR = System.getProperty("user.dir") + "\\src\\servers\\verdun";
    private static Logger logger;

    public VerdunTheatre() throws RemoteException {
        super(logger);

    }

    public static void main(String[] args) {

        Registry registry;
        VerdunTheatre verdunTheatre;
        try {
            addLogger();
            // create the (local) object registry
            registry = LocateRegistry.createRegistry(8888);
            verdunTheatre = new VerdunTheatre();
            verdunTheatre.addTestData();
            // bind the object to the name "server"
            registry.rebind("verdunTheatre", verdunTheatre);
            (new Thread(new Runnable() {
                @Override
                public void run() {
                    recieveUDPMessages(verdunTheatre, 8888, logger);
                }
            })).start();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void addLogger() {
        logger = Logger.getLogger(AtwaterTheatre.class.getName());
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
        addMovieSlotInHashMap("Avatar", "VERM120223", 50);
        addMovieSlotInHashMap("Avengers", "VERE140223", 30);
        addMovieSlotInHashMap("Avatar", "VERA150223", 60);
        addMovieSlotInHashMap("Avengers", "VERA150223", 40);
        addMovieSlotInHashMap("Avatar", "VERE160223", 70);


    }

    @Override
    public String listMovieShowsAvailability(String movieName) throws RemoteException {
        String result = "";
        String resultFromOUT = sendUDPMessages(9999, "GET_SHOWS-" + movieName);
        String resultFromATW = sendUDPMessages(7777, "GET_SHOWS-" + movieName);
        String resultLocal = super.listMovieShowsAvailability(movieName);
        String joined =
                Stream.of(resultLocal, resultFromOUT, resultFromATW)
                        .filter(s -> s != null && !s.isEmpty())
                        .collect(Collectors.joining(","));
        if (joined.isEmpty()) result = "";
        else result = movieName + ":" + joined;

        utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage("listMovieShowsAvailability", "movieName : " + movieName, "Operation Sucessful", result);

        logger.log(Level.INFO, msg.toString());

        return result;
    }

    @Override
    public synchronized String bookMovieTickets(String customerID, String movieID, String movieName, int numberOfTickets) {
        String res = super.bookMovieTickets(customerID, movieID, movieName, numberOfTickets);
        String movieInServer = movieID.substring(0, 3);
        if (res.equals("SEND_TO_SERVERS")) {
            String propToSend = "BOOK_TICKETS-" + customerID + "," + movieID + "," + movieName + "," + numberOfTickets;
            switch (movieInServer) {
                case "OUT":
                    res = sendUDPMessages(9999, propToSend);
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


//        String res = super.bookMovieTickets(customerID, movieID, movieName, numberOfTickets);
//        if (res == null) {
//            //book in other servers
//
//            //
//            String customerTicketsInOtherTheatres = getCustomerTicketsInOtherTheatres(customerID);
//            System.out.println(customerTicketsInOtherTheatres);
//            //same server -> check customer other server tickets
//            if (clientFromServer.equals(movieInServer)) {
//                //write logic
//
//                //if sucess
//                updateMovieCount(movieName, movieID, numberOfTickets, false);
//                addCustomerMovieCount(customerID, movieName, movieID, numberOfTickets);
//                res = "Booking successful";
//
//                utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage("bookMovieTickets", "customerID : " + customerID + ", movieID: " + movieID + ", movieName: " + movieName + ", numberOfTickets: " + numberOfTickets, "Operation Sucessful", res);
//
//                logger.log(Level.INFO, msg.toString());
//
//                return res;
//            }
//            return "";
//
//        } else {
//            return res;
//        }
    }

//    public String getCustomerTicketsInOtherTheatres(String customerID) {
//        String result = "";
//        String resultFromOUT = sendUDPMessages(9999, "GET_TICKETS-" + customerID);
//        String resultFromATW = sendUDPMessages(7777, "GET_TICKETS-" + customerID);
//        String joined =
//                Stream.of(resultFromOUT, resultFromATW)
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

//    @Override
//    public synchronized String getBookingSchedule(String customerID) {
////        String result = Stream.of(getCustomerTicketsInCurrentTheatre(customerID), getCustomerTicketsInOtherTheatres(customerID))
////                .filter(s -> s != null && !s.isEmpty())
////                .collect(Collectors.joining(","));
////        utils.Logger.CustomMessage msg = new utils.Logger.CustomMessage("getBookingSchedule", "customerID : " + customerID, "Operation Sucessful", result);
////
////        logger.log(Level.INFO, msg.toString());
////        return result;
//    }
}
