package HW_Lecture_3_4.Task_2_CinemaApp;

import java.time.LocalTime;

public class CinemaRunner {
    public static void main(String[] args) {
        Movie movie = new Movie("Terminator 2", 1991, 2, "Very cool movie");
        HallForSession hallForSession = new HallForSession(5, 5);
        System.out.println("Number of seats = " + hallForSession.getAmountSeats());

        System.out.println("reservation...");

        hallForSession.reservation(1);
        hallForSession.reservation(24);
        hallForSession.reservation(23);
        hallForSession.reservation(20);
        hallForSession.reservation(2);
        hallForSession.reservation(3);

        System.out.println(hallForSession);
        System.out.println("Number of reserved seats = "+hallForSession.getNumberOfReservedSeats());
        System.out.println("Number of free seats = "+hallForSession.getNumberOfFreeSeats());

        MovieSession movieSession = new MovieSession(movie, hallForSession, 100, LocalTime.of(14,30));
        System.out.println("Profit is "+movieSession.getProfit()); //600
    }
}
