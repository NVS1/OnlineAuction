package HW_Lecture_5_6.Task_2_AirlineTicket;

import java.time.LocalTime;

public class TicketRunner {
    public static void main(String[] args) {
        FlightInfo flightInfo = new FlightInfo(12345,"Kiev", "London", LocalTime.of(13,10),20,3000);
        PassengerInfo passengerInfo = new PassengerInfo("Oleg", "Olegov","KA12345");
        Ticket ticket = new VipTicket("000001",passengerInfo,flightInfo,new Baggage(20,6),new Meal("Food",true,100));
        System.out.println(ticket);
        System.out.println(ticket.getPrice()); //3220
    }
}
