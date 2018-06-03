package HW_Lecture_3_4.Task_2_CinemaApp;

public class Seat {
    private boolean isReserved = false;


    public boolean isReserved() {
        return isReserved;
    }

    public void setReservation() {
        isReserved = true;
    }

    @Override
    public String toString() {
        return "HW_Lecture_3_4.Task_2_CinemaApp.Seat{" +
                "isReserved=" + isReserved +
                '}';
    }
}
