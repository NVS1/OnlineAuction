package HW_Lecture_3_4.Task_2_CinemaApp;

import java.util.ArrayList;

public class HallForSession {
    private final int numberRow;
    private final int numberSeatsInRow;
    private final int amountSeats;
    private final ArrayList<Seat> seats = new ArrayList<>();

    public HallForSession(int numberRow, int numberSeatsInRow) {
        this.numberRow = numberRow;
        this.numberSeatsInRow = numberSeatsInRow;
        this.amountSeats = numberSeatsInRow * numberRow;
        for (int i = 1; i <= amountSeats; i++) {
            seats.add(new Seat());
        }
    }

    public void reservation(int number) {
        if (number>seats.size() || number<1){
            throw new IllegalArgumentException("Incorrectly number");
        }
        seats.get(number-1).setReservation();
    }

    public int getNumberOfFreeSeats() {
        int sum = 0;
        for (Seat seat : seats) {
            if (!seat.isReserved()) {
                sum++;
            }
        }
        return sum;
    }

    public int getNumberOfReservedSeats() {
        int sum = 0;
        for (Seat seat : seats) {
            if (seat.isReserved()) {
                sum++;
            }
        }
        return sum;
    }

    public int getAmountSeats() {
        return amountSeats;
    }

    @Override
    public String toString() {
        return "HW_Lecture_3_4.Task_2_CinemaApp.HallForSession{" +
                "numberRow=" + numberRow +
                ", numberSeatsInRow=" + numberSeatsInRow +
                ", seats=" + seats +
                '}';
    }
}
