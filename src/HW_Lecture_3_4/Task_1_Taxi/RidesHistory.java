package HW_Lecture_3_4.Task_1_Taxi;

import java.util.ArrayList;
import java.util.List;

public class RidesHistory {
    private final List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public long getTotalPrice() {
        long sum = 0;
        for (Ride ride : rides) {
            sum += ride.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "HW_Lecture_3_4.Task_1_Taxi.RidesHistory{" +
                "rides=" + rides +
                '}';
    }
}
