
package Gens.verdun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Gens.verdun package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateMovieCountResponse_QNAME = new QName("http://Verdun.servers/", "updateMovieCountResponse");
    private final static QName _AddMovieSlotsResponse_QNAME = new QName("http://Verdun.servers/", "addMovieSlotsResponse");
    private final static QName _GetCountOfTicketFromOtherTheatresResponse_QNAME = new QName("http://Verdun.servers/", "getCountOfTicketFromOtherTheatresResponse");
    private final static QName _AddMovieSlotInHashMapResponse_QNAME = new QName("http://Verdun.servers/", "addMovieSlotInHashMapResponse");
    private final static QName _CancelMovieTicketsResponse_QNAME = new QName("http://Verdun.servers/", "cancelMovieTicketsResponse");
    private final static QName _AddCustomerMovieCount_QNAME = new QName("http://Verdun.servers/", "addCustomerMovieCount");
    private final static QName _RemoveMovieSlotsResponse_QNAME = new QName("http://Verdun.servers/", "removeMovieSlotsResponse");
    private final static QName _CancelMovieTickets_QNAME = new QName("http://Verdun.servers/", "cancelMovieTickets");
    private final static QName _BookMovieTicketsResponse_QNAME = new QName("http://Verdun.servers/", "bookMovieTicketsResponse");
    private final static QName _GetBookingScheduleResponse_QNAME = new QName("http://Verdun.servers/", "getBookingScheduleResponse");
    private final static QName _ListMovieShowsAvailability_QNAME = new QName("http://Verdun.servers/", "listMovieShowsAvailability");
    private final static QName _FindNextAvailableSlotAndReturnSlot_QNAME = new QName("http://Verdun.servers/", "findNextAvailableSlotAndReturnSlot");
    private final static QName _FindNextAvailableSlotAndReturnSlotResponse_QNAME = new QName("http://Verdun.servers/", "findNextAvailableSlotAndReturnSlotResponse");
    private final static QName _FindCustomersAndAdjustTimings_QNAME = new QName("http://Verdun.servers/", "findCustomersAndAdjustTimings");
    private final static QName _RemoveMovieSlots_QNAME = new QName("http://Verdun.servers/", "removeMovieSlots");
    private final static QName _AddMovieSlotInHashMap_QNAME = new QName("http://Verdun.servers/", "addMovieSlotInHashMap");
    private final static QName _AddTestDataResponse_QNAME = new QName("http://Verdun.servers/", "addTestDataResponse");
    private final static QName _UpdateMovieCount_QNAME = new QName("http://Verdun.servers/", "updateMovieCount");
    private final static QName _BookMovieTicketsInLocalServerResponse_QNAME = new QName("http://Verdun.servers/", "bookMovieTicketsInLocalServerResponse");
    private final static QName _GetLocalMoviesShowsAvailabilityResponse_QNAME = new QName("http://Verdun.servers/", "getLocalMoviesShowsAvailabilityResponse");
    private final static QName _BookMovieTickets_QNAME = new QName("http://Verdun.servers/", "bookMovieTickets");
    private final static QName _FindCustomersAndAdjustTimingsResponse_QNAME = new QName("http://Verdun.servers/", "findCustomersAndAdjustTimingsResponse");
    private final static QName _BookMovieTicketsInLocalServer_QNAME = new QName("http://Verdun.servers/", "bookMovieTicketsInLocalServer");
    private final static QName _AddMovieSlots_QNAME = new QName("http://Verdun.servers/", "addMovieSlots");
    private final static QName _CheckBookingExists_QNAME = new QName("http://Verdun.servers/", "checkBookingExists");
    private final static QName _CheckBookingExistsResponse_QNAME = new QName("http://Verdun.servers/", "checkBookingExistsResponse");
    private final static QName _GetBookingSchedule_QNAME = new QName("http://Verdun.servers/", "getBookingSchedule");
    private final static QName _GetLocalMoviesShowsAvailability_QNAME = new QName("http://Verdun.servers/", "getLocalMoviesShowsAvailability");
    private final static QName _ExchangeTicketsResponse_QNAME = new QName("http://Verdun.servers/", "exchangeTicketsResponse");
    private final static QName _AddTestData_QNAME = new QName("http://Verdun.servers/", "addTestData");
    private final static QName _ListMovieShowsAvailabilityResponse_QNAME = new QName("http://Verdun.servers/", "listMovieShowsAvailabilityResponse");
    private final static QName _AddCustomerMovieCountResponse_QNAME = new QName("http://Verdun.servers/", "addCustomerMovieCountResponse");
    private final static QName _ExchangeTickets_QNAME = new QName("http://Verdun.servers/", "exchangeTickets");
    private final static QName _GetCountOfTicketFromOtherTheatres_QNAME = new QName("http://Verdun.servers/", "getCountOfTicketFromOtherTheatres");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Gens.verdun
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookMovieTickets }
     * 
     */
    public BookMovieTickets createBookMovieTickets() {
        return new BookMovieTickets();
    }

    /**
     * Create an instance of {@link FindCustomersAndAdjustTimingsResponse }
     * 
     */
    public FindCustomersAndAdjustTimingsResponse createFindCustomersAndAdjustTimingsResponse() {
        return new FindCustomersAndAdjustTimingsResponse();
    }

    /**
     * Create an instance of {@link GetLocalMoviesShowsAvailabilityResponse }
     * 
     */
    public GetLocalMoviesShowsAvailabilityResponse createGetLocalMoviesShowsAvailabilityResponse() {
        return new GetLocalMoviesShowsAvailabilityResponse();
    }

    /**
     * Create an instance of {@link BookMovieTicketsInLocalServerResponse }
     * 
     */
    public BookMovieTicketsInLocalServerResponse createBookMovieTicketsInLocalServerResponse() {
        return new BookMovieTicketsInLocalServerResponse();
    }

    /**
     * Create an instance of {@link AddTestDataResponse }
     * 
     */
    public AddTestDataResponse createAddTestDataResponse() {
        return new AddTestDataResponse();
    }

    /**
     * Create an instance of {@link UpdateMovieCount }
     * 
     */
    public UpdateMovieCount createUpdateMovieCount() {
        return new UpdateMovieCount();
    }

    /**
     * Create an instance of {@link GetCountOfTicketFromOtherTheatres }
     * 
     */
    public GetCountOfTicketFromOtherTheatres createGetCountOfTicketFromOtherTheatres() {
        return new GetCountOfTicketFromOtherTheatres();
    }

    /**
     * Create an instance of {@link AddCustomerMovieCountResponse }
     * 
     */
    public AddCustomerMovieCountResponse createAddCustomerMovieCountResponse() {
        return new AddCustomerMovieCountResponse();
    }

    /**
     * Create an instance of {@link ExchangeTickets }
     * 
     */
    public ExchangeTickets createExchangeTickets() {
        return new ExchangeTickets();
    }

    /**
     * Create an instance of {@link AddTestData }
     * 
     */
    public AddTestData createAddTestData() {
        return new AddTestData();
    }

    /**
     * Create an instance of {@link ListMovieShowsAvailabilityResponse }
     * 
     */
    public ListMovieShowsAvailabilityResponse createListMovieShowsAvailabilityResponse() {
        return new ListMovieShowsAvailabilityResponse();
    }

    /**
     * Create an instance of {@link ExchangeTicketsResponse }
     * 
     */
    public ExchangeTicketsResponse createExchangeTicketsResponse() {
        return new ExchangeTicketsResponse();
    }

    /**
     * Create an instance of {@link GetBookingSchedule }
     * 
     */
    public GetBookingSchedule createGetBookingSchedule() {
        return new GetBookingSchedule();
    }

    /**
     * Create an instance of {@link GetLocalMoviesShowsAvailability }
     * 
     */
    public GetLocalMoviesShowsAvailability createGetLocalMoviesShowsAvailability() {
        return new GetLocalMoviesShowsAvailability();
    }

    /**
     * Create an instance of {@link CheckBookingExists }
     * 
     */
    public CheckBookingExists createCheckBookingExists() {
        return new CheckBookingExists();
    }

    /**
     * Create an instance of {@link CheckBookingExistsResponse }
     * 
     */
    public CheckBookingExistsResponse createCheckBookingExistsResponse() {
        return new CheckBookingExistsResponse();
    }

    /**
     * Create an instance of {@link BookMovieTicketsInLocalServer }
     * 
     */
    public BookMovieTicketsInLocalServer createBookMovieTicketsInLocalServer() {
        return new BookMovieTicketsInLocalServer();
    }

    /**
     * Create an instance of {@link AddMovieSlots }
     * 
     */
    public AddMovieSlots createAddMovieSlots() {
        return new AddMovieSlots();
    }

    /**
     * Create an instance of {@link RemoveMovieSlotsResponse }
     * 
     */
    public RemoveMovieSlotsResponse createRemoveMovieSlotsResponse() {
        return new RemoveMovieSlotsResponse();
    }

    /**
     * Create an instance of {@link AddCustomerMovieCount }
     * 
     */
    public AddCustomerMovieCount createAddCustomerMovieCount() {
        return new AddCustomerMovieCount();
    }

    /**
     * Create an instance of {@link CancelMovieTicketsResponse }
     * 
     */
    public CancelMovieTicketsResponse createCancelMovieTicketsResponse() {
        return new CancelMovieTicketsResponse();
    }

    /**
     * Create an instance of {@link AddMovieSlotInHashMapResponse }
     * 
     */
    public AddMovieSlotInHashMapResponse createAddMovieSlotInHashMapResponse() {
        return new AddMovieSlotInHashMapResponse();
    }

    /**
     * Create an instance of {@link GetCountOfTicketFromOtherTheatresResponse }
     * 
     */
    public GetCountOfTicketFromOtherTheatresResponse createGetCountOfTicketFromOtherTheatresResponse() {
        return new GetCountOfTicketFromOtherTheatresResponse();
    }

    /**
     * Create an instance of {@link AddMovieSlotsResponse }
     * 
     */
    public AddMovieSlotsResponse createAddMovieSlotsResponse() {
        return new AddMovieSlotsResponse();
    }

    /**
     * Create an instance of {@link UpdateMovieCountResponse }
     * 
     */
    public UpdateMovieCountResponse createUpdateMovieCountResponse() {
        return new UpdateMovieCountResponse();
    }

    /**
     * Create an instance of {@link AddMovieSlotInHashMap }
     * 
     */
    public AddMovieSlotInHashMap createAddMovieSlotInHashMap() {
        return new AddMovieSlotInHashMap();
    }

    /**
     * Create an instance of {@link FindCustomersAndAdjustTimings }
     * 
     */
    public FindCustomersAndAdjustTimings createFindCustomersAndAdjustTimings() {
        return new FindCustomersAndAdjustTimings();
    }

    /**
     * Create an instance of {@link RemoveMovieSlots }
     * 
     */
    public RemoveMovieSlots createRemoveMovieSlots() {
        return new RemoveMovieSlots();
    }

    /**
     * Create an instance of {@link FindNextAvailableSlotAndReturnSlot }
     * 
     */
    public FindNextAvailableSlotAndReturnSlot createFindNextAvailableSlotAndReturnSlot() {
        return new FindNextAvailableSlotAndReturnSlot();
    }

    /**
     * Create an instance of {@link FindNextAvailableSlotAndReturnSlotResponse }
     * 
     */
    public FindNextAvailableSlotAndReturnSlotResponse createFindNextAvailableSlotAndReturnSlotResponse() {
        return new FindNextAvailableSlotAndReturnSlotResponse();
    }

    /**
     * Create an instance of {@link ListMovieShowsAvailability }
     * 
     */
    public ListMovieShowsAvailability createListMovieShowsAvailability() {
        return new ListMovieShowsAvailability();
    }

    /**
     * Create an instance of {@link GetBookingScheduleResponse }
     * 
     */
    public GetBookingScheduleResponse createGetBookingScheduleResponse() {
        return new GetBookingScheduleResponse();
    }

    /**
     * Create an instance of {@link BookMovieTicketsResponse }
     * 
     */
    public BookMovieTicketsResponse createBookMovieTicketsResponse() {
        return new BookMovieTicketsResponse();
    }

    /**
     * Create an instance of {@link CancelMovieTickets }
     * 
     */
    public CancelMovieTickets createCancelMovieTickets() {
        return new CancelMovieTickets();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovieCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "updateMovieCountResponse")
    public JAXBElement<UpdateMovieCountResponse> createUpdateMovieCountResponse(UpdateMovieCountResponse value) {
        return new JAXBElement<UpdateMovieCountResponse>(_UpdateMovieCountResponse_QNAME, UpdateMovieCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieSlotsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "addMovieSlotsResponse")
    public JAXBElement<AddMovieSlotsResponse> createAddMovieSlotsResponse(AddMovieSlotsResponse value) {
        return new JAXBElement<AddMovieSlotsResponse>(_AddMovieSlotsResponse_QNAME, AddMovieSlotsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountOfTicketFromOtherTheatresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "getCountOfTicketFromOtherTheatresResponse")
    public JAXBElement<GetCountOfTicketFromOtherTheatresResponse> createGetCountOfTicketFromOtherTheatresResponse(GetCountOfTicketFromOtherTheatresResponse value) {
        return new JAXBElement<GetCountOfTicketFromOtherTheatresResponse>(_GetCountOfTicketFromOtherTheatresResponse_QNAME, GetCountOfTicketFromOtherTheatresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieSlotInHashMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "addMovieSlotInHashMapResponse")
    public JAXBElement<AddMovieSlotInHashMapResponse> createAddMovieSlotInHashMapResponse(AddMovieSlotInHashMapResponse value) {
        return new JAXBElement<AddMovieSlotInHashMapResponse>(_AddMovieSlotInHashMapResponse_QNAME, AddMovieSlotInHashMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelMovieTicketsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "cancelMovieTicketsResponse")
    public JAXBElement<CancelMovieTicketsResponse> createCancelMovieTicketsResponse(CancelMovieTicketsResponse value) {
        return new JAXBElement<CancelMovieTicketsResponse>(_CancelMovieTicketsResponse_QNAME, CancelMovieTicketsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerMovieCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "addCustomerMovieCount")
    public JAXBElement<AddCustomerMovieCount> createAddCustomerMovieCount(AddCustomerMovieCount value) {
        return new JAXBElement<AddCustomerMovieCount>(_AddCustomerMovieCount_QNAME, AddCustomerMovieCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMovieSlotsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "removeMovieSlotsResponse")
    public JAXBElement<RemoveMovieSlotsResponse> createRemoveMovieSlotsResponse(RemoveMovieSlotsResponse value) {
        return new JAXBElement<RemoveMovieSlotsResponse>(_RemoveMovieSlotsResponse_QNAME, RemoveMovieSlotsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelMovieTickets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "cancelMovieTickets")
    public JAXBElement<CancelMovieTickets> createCancelMovieTickets(CancelMovieTickets value) {
        return new JAXBElement<CancelMovieTickets>(_CancelMovieTickets_QNAME, CancelMovieTickets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookMovieTicketsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "bookMovieTicketsResponse")
    public JAXBElement<BookMovieTicketsResponse> createBookMovieTicketsResponse(BookMovieTicketsResponse value) {
        return new JAXBElement<BookMovieTicketsResponse>(_BookMovieTicketsResponse_QNAME, BookMovieTicketsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingScheduleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "getBookingScheduleResponse")
    public JAXBElement<GetBookingScheduleResponse> createGetBookingScheduleResponse(GetBookingScheduleResponse value) {
        return new JAXBElement<GetBookingScheduleResponse>(_GetBookingScheduleResponse_QNAME, GetBookingScheduleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMovieShowsAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "listMovieShowsAvailability")
    public JAXBElement<ListMovieShowsAvailability> createListMovieShowsAvailability(ListMovieShowsAvailability value) {
        return new JAXBElement<ListMovieShowsAvailability>(_ListMovieShowsAvailability_QNAME, ListMovieShowsAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNextAvailableSlotAndReturnSlot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "findNextAvailableSlotAndReturnSlot")
    public JAXBElement<FindNextAvailableSlotAndReturnSlot> createFindNextAvailableSlotAndReturnSlot(FindNextAvailableSlotAndReturnSlot value) {
        return new JAXBElement<FindNextAvailableSlotAndReturnSlot>(_FindNextAvailableSlotAndReturnSlot_QNAME, FindNextAvailableSlotAndReturnSlot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNextAvailableSlotAndReturnSlotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "findNextAvailableSlotAndReturnSlotResponse")
    public JAXBElement<FindNextAvailableSlotAndReturnSlotResponse> createFindNextAvailableSlotAndReturnSlotResponse(FindNextAvailableSlotAndReturnSlotResponse value) {
        return new JAXBElement<FindNextAvailableSlotAndReturnSlotResponse>(_FindNextAvailableSlotAndReturnSlotResponse_QNAME, FindNextAvailableSlotAndReturnSlotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomersAndAdjustTimings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "findCustomersAndAdjustTimings")
    public JAXBElement<FindCustomersAndAdjustTimings> createFindCustomersAndAdjustTimings(FindCustomersAndAdjustTimings value) {
        return new JAXBElement<FindCustomersAndAdjustTimings>(_FindCustomersAndAdjustTimings_QNAME, FindCustomersAndAdjustTimings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMovieSlots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "removeMovieSlots")
    public JAXBElement<RemoveMovieSlots> createRemoveMovieSlots(RemoveMovieSlots value) {
        return new JAXBElement<RemoveMovieSlots>(_RemoveMovieSlots_QNAME, RemoveMovieSlots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieSlotInHashMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "addMovieSlotInHashMap")
    public JAXBElement<AddMovieSlotInHashMap> createAddMovieSlotInHashMap(AddMovieSlotInHashMap value) {
        return new JAXBElement<AddMovieSlotInHashMap>(_AddMovieSlotInHashMap_QNAME, AddMovieSlotInHashMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTestDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "addTestDataResponse")
    public JAXBElement<AddTestDataResponse> createAddTestDataResponse(AddTestDataResponse value) {
        return new JAXBElement<AddTestDataResponse>(_AddTestDataResponse_QNAME, AddTestDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovieCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "updateMovieCount")
    public JAXBElement<UpdateMovieCount> createUpdateMovieCount(UpdateMovieCount value) {
        return new JAXBElement<UpdateMovieCount>(_UpdateMovieCount_QNAME, UpdateMovieCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookMovieTicketsInLocalServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "bookMovieTicketsInLocalServerResponse")
    public JAXBElement<BookMovieTicketsInLocalServerResponse> createBookMovieTicketsInLocalServerResponse(BookMovieTicketsInLocalServerResponse value) {
        return new JAXBElement<BookMovieTicketsInLocalServerResponse>(_BookMovieTicketsInLocalServerResponse_QNAME, BookMovieTicketsInLocalServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocalMoviesShowsAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "getLocalMoviesShowsAvailabilityResponse")
    public JAXBElement<GetLocalMoviesShowsAvailabilityResponse> createGetLocalMoviesShowsAvailabilityResponse(GetLocalMoviesShowsAvailabilityResponse value) {
        return new JAXBElement<GetLocalMoviesShowsAvailabilityResponse>(_GetLocalMoviesShowsAvailabilityResponse_QNAME, GetLocalMoviesShowsAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookMovieTickets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "bookMovieTickets")
    public JAXBElement<BookMovieTickets> createBookMovieTickets(BookMovieTickets value) {
        return new JAXBElement<BookMovieTickets>(_BookMovieTickets_QNAME, BookMovieTickets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomersAndAdjustTimingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "findCustomersAndAdjustTimingsResponse")
    public JAXBElement<FindCustomersAndAdjustTimingsResponse> createFindCustomersAndAdjustTimingsResponse(FindCustomersAndAdjustTimingsResponse value) {
        return new JAXBElement<FindCustomersAndAdjustTimingsResponse>(_FindCustomersAndAdjustTimingsResponse_QNAME, FindCustomersAndAdjustTimingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookMovieTicketsInLocalServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "bookMovieTicketsInLocalServer")
    public JAXBElement<BookMovieTicketsInLocalServer> createBookMovieTicketsInLocalServer(BookMovieTicketsInLocalServer value) {
        return new JAXBElement<BookMovieTicketsInLocalServer>(_BookMovieTicketsInLocalServer_QNAME, BookMovieTicketsInLocalServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieSlots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "addMovieSlots")
    public JAXBElement<AddMovieSlots> createAddMovieSlots(AddMovieSlots value) {
        return new JAXBElement<AddMovieSlots>(_AddMovieSlots_QNAME, AddMovieSlots.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBookingExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "checkBookingExists")
    public JAXBElement<CheckBookingExists> createCheckBookingExists(CheckBookingExists value) {
        return new JAXBElement<CheckBookingExists>(_CheckBookingExists_QNAME, CheckBookingExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBookingExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "checkBookingExistsResponse")
    public JAXBElement<CheckBookingExistsResponse> createCheckBookingExistsResponse(CheckBookingExistsResponse value) {
        return new JAXBElement<CheckBookingExistsResponse>(_CheckBookingExistsResponse_QNAME, CheckBookingExistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "getBookingSchedule")
    public JAXBElement<GetBookingSchedule> createGetBookingSchedule(GetBookingSchedule value) {
        return new JAXBElement<GetBookingSchedule>(_GetBookingSchedule_QNAME, GetBookingSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocalMoviesShowsAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "getLocalMoviesShowsAvailability")
    public JAXBElement<GetLocalMoviesShowsAvailability> createGetLocalMoviesShowsAvailability(GetLocalMoviesShowsAvailability value) {
        return new JAXBElement<GetLocalMoviesShowsAvailability>(_GetLocalMoviesShowsAvailability_QNAME, GetLocalMoviesShowsAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeTicketsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "exchangeTicketsResponse")
    public JAXBElement<ExchangeTicketsResponse> createExchangeTicketsResponse(ExchangeTicketsResponse value) {
        return new JAXBElement<ExchangeTicketsResponse>(_ExchangeTicketsResponse_QNAME, ExchangeTicketsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "addTestData")
    public JAXBElement<AddTestData> createAddTestData(AddTestData value) {
        return new JAXBElement<AddTestData>(_AddTestData_QNAME, AddTestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMovieShowsAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "listMovieShowsAvailabilityResponse")
    public JAXBElement<ListMovieShowsAvailabilityResponse> createListMovieShowsAvailabilityResponse(ListMovieShowsAvailabilityResponse value) {
        return new JAXBElement<ListMovieShowsAvailabilityResponse>(_ListMovieShowsAvailabilityResponse_QNAME, ListMovieShowsAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerMovieCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "addCustomerMovieCountResponse")
    public JAXBElement<AddCustomerMovieCountResponse> createAddCustomerMovieCountResponse(AddCustomerMovieCountResponse value) {
        return new JAXBElement<AddCustomerMovieCountResponse>(_AddCustomerMovieCountResponse_QNAME, AddCustomerMovieCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeTickets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "exchangeTickets")
    public JAXBElement<ExchangeTickets> createExchangeTickets(ExchangeTickets value) {
        return new JAXBElement<ExchangeTickets>(_ExchangeTickets_QNAME, ExchangeTickets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountOfTicketFromOtherTheatres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Verdun.servers/", name = "getCountOfTicketFromOtherTheatres")
    public JAXBElement<GetCountOfTicketFromOtherTheatres> createGetCountOfTicketFromOtherTheatres(GetCountOfTicketFromOtherTheatres value) {
        return new JAXBElement<GetCountOfTicketFromOtherTheatres>(_GetCountOfTicketFromOtherTheatres_QNAME, GetCountOfTicketFromOtherTheatres.class, null, value);
    }

}
