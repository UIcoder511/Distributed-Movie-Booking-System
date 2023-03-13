package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CustomerInterface extends Remote {

    String bookMovieTickets(String customerID, String movieID, String movieName, int numberOfTickets) throws RemoteException;

    String getBookingSchedule(String customerID) throws RemoteException;

    String cancelMovieTickets(String customerID, String movieID, String movieName, int numberOfTickets) throws RemoteException;

    String exchangeTickets(String customerID, String movieID, String newMovieID, String oldMovieName, String movieName, int numberOfTickets) throws RemoteException;

}
