package HW_Lecture_3_4.Task_1_Taxi;

public class FamilyTariff implements Tariff {

    @Override
    public long calculatePrice(Ride ride) {
        return 50 + 20 * ride.getDistance() / ride.getPassengers();
    }
}
