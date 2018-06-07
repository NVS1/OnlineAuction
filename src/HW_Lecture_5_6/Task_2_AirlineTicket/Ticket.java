package HW_Lecture_5_6.Task_2_AirlineTicket;

public class Ticket {
    private final String ticketNum;
    private final PassengerInfo passengerInfo;
    private final FlightInfo flightInfo;

    public Ticket(String ticketNum, PassengerInfo passengerInfo, FlightInfo flightInfo) {
        this.ticketNum = ticketNum;
        this.passengerInfo = passengerInfo;
        this.flightInfo = flightInfo;
    }

    public long getPrice() {
        return flightInfo.getPrice();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNum='" + ticketNum + '\'' +
                ", passengerInfo=" + passengerInfo +
                ", flightInfo=" + flightInfo +
                '}';
    }
}
