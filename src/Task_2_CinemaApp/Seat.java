package Task_2_CinemaApp;

public class Seat {
    private final int numberSeat;
    private boolean isReserved = false;

    public Seat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReservation() {
        isReserved = true;
    }

    @Override
    public String toString() {
        return "Task_2_CinemaApp.Seat{" +
                "isReserved=" + isReserved +
                '}';
    }
}
