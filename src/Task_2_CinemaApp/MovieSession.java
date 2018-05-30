package Task_2_CinemaApp;

import java.time.LocalTime;

public class MovieSession {
    private final Movie movie;
    private final HallForSession hallForSession;
    private final long price;
    private final LocalTime time;

    public MovieSession(Movie movie, HallForSession hallForSession, long price, LocalTime time) {
        this.movie = movie;
        this.hallForSession = hallForSession;
        this.price = price;
        this.time = time;
    }
    public long getProfit (){
        return hallForSession.getNumberOfReservedSeats()*price;
    }

    @Override
    public String toString() {
        return "Task_2_CinemaApp.MovieSession{" +
                "movie=" + movie +
                ", hallForSession=" + hallForSession +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
