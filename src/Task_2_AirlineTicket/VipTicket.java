package Task_2_AirlineTicket;

public class VipTicket extends Ticket {
    private final Service baggage;
    private final Service meal;

    public VipTicket(String ticketNum, PassengerInfo passengerInfo, FlightInfo flightInfo, Service baggage, Service meal) {
        super(ticketNum, passengerInfo, flightInfo);
        this.baggage = baggage;
        this.meal = meal;
    }

    @Override
    public long getPrice() {
        return super.getPrice()+baggage.getPrice()+meal.getPrice();
    }
}
