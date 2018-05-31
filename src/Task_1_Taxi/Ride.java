package Task_1_Taxi;

public class Ride {
    private final Tariff tariff;
    private final int passengers;
    private final int distance;
    private final int duration;

    public Ride(Tariff tariff, int passengers, int distance, int duration) {
        this.tariff = tariff;
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    public long getPrice() {
        return tariff.calculatePrice(this);
    }

    @Override
    public String toString() {
        return "Task_1_Taxi.Ride{" +
                "tariff=" + tariff +
                ", passengers=" + passengers +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }
}
