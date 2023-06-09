package utils;


import servers.TheatreImplementation;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class UDPSendRecieve {

    public static <T extends TheatreImplementation> void recieveUDPMessages(T theatre, int serverPort, Logger logger) {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(serverPort);

            DatagramPacket dp = null;
            byte[] data;
            while (true) {

                data = new byte[65535];
                dp = new DatagramPacket(data, data.length);
                try {
                    ds.receive(dp);
                    String res = new String(dp.getData()).trim();
                    System.out.println("rec " + new String(dp.getData()).trim());
                    String[] resMethodWithData = res.split("-");
                    String resToSend = "";

                    switch (resMethodWithData[0]) {
//                        case "GET_TICKETS":
//                            resToSend = theatre.getCustomerTicketsInCurrentTheatre(resMethodWithData[1]);
//                            break;
                        case "GET_SHOWS":
                            resToSend = theatre.getLocalMoviesShowsAvailability(resMethodWithData[1]);
                            break;
                        case "BOOK_TICKETS":
                            String[] paras = resMethodWithData[1].split(",");
                            String customerID = paras[0];
                            String movieID = paras[1];
                            String movieName = paras[2];
                            int numberOfTickets = Integer.parseInt(paras[3]);
                            resToSend = theatre.bookMovieTicketsInLocalServer(customerID, movieID, movieName, numberOfTickets);
                            break;
                        case "REQ_MOVIE_CANCEL":
                            paras = resMethodWithData[1].split(",");

                            movieID = paras[0];
                            movieName = paras[1];
                            numberOfTickets = Integer.parseInt(paras[2]);
                            theatre.updateMovieCount(movieName, movieID, numberOfTickets, true);
                            break;
                    }

                    System.out.println("r " + resToSend);
                    byte[] sendData = resToSend.getBytes();
//                    System.out.println("r " + new String(sendData, 0,
//                            sendData.getLength()));
                    ds.send(new DatagramPacket(sendData, sendData.length, dp.getAddress(), dp.getPort()));
                    logger.info("");
                } catch (IOException e) {
                    System.out.println("IOE: " + e.getMessage());
                }


            }
        } catch (SocketException e) {
            System.out.println("SOE: " + e.getMessage());
        } finally {
            ds.close();
        }
    }

    public static String sendUDPMessages(int serverPort, String data) {
        DatagramSocket ds = null;
        String result = null;

        try {
            ds = new DatagramSocket();
            InetAddress aHost = InetAddress.getByName("localhost");

            byte[] message = data.getBytes();
            DatagramPacket dp = new DatagramPacket(message, message.length, aHost, serverPort);
            ds.setSoTimeout(2000);
            ds.send(dp);

            byte[] res = new byte[65535];
            DatagramPacket dpres = new DatagramPacket(res, res.length);
            ds.receive(dpres);

            result = new String(dpres.getData()).trim();
            System.out.println("s " + result);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            return result;
        }


    }
}
