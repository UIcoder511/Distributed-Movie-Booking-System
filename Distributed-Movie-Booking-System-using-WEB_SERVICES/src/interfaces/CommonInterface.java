package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CommonInterface extends Remote {
  @WebMethod
  public String addMovieSlots(
    String movieID,
    String movieName,
    int bookingCapacity
  ) throws RemoteException;

  @WebMethod
  public String removeMovieSlots(String movieID, String movieName)
    throws RemoteException;

  @WebMethod
  public String listMovieShowsAvailability(String movieName)
    throws RemoteException;

  @WebMethod
  public String bookMovieTickets(
    String customerID,
    String movieID,
    String movieName,
    int numberOfTickets
  ) throws RemoteException;

  @WebMethod
  public String getBookingSchedule(String customerID) throws RemoteException;

  @WebMethod
  public String cancelMovieTickets(
    String customerID,
    String movieID,
    String movieName,
    int numberOfTickets
  ) throws RemoteException;

  @WebMethod
  public String exchangeTickets(
    String customerID,
    String movieID,
    String newMovieID,
    String oldMovieName,
    String movieName,
    int numberOfTickets
  ) throws RemoteException;
}
