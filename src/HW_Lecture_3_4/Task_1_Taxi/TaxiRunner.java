package HW_Lecture_3_4.Task_1_Taxi;

public class TaxiRunner {
    public static void main(String[] args) {
        Ride ride1 = new Ride(new StandardTariff(), 1, 30, 25); //230
        Ride ride2 = new Ride(new FamilyTariff(), 3, 15, 15); //150
        Ride ride3 = new Ride(new StandardTariff(), 1, 40, 35); //300

        RidesHistory ridesHistory = new RidesHistory();
        ridesHistory.addRide(ride1);
        ridesHistory.addRide(ride2);
        ridesHistory.addRide(ride3);
        System.out.println(ridesHistory);
        System.out.println("Total price = " + ridesHistory.getTotalPrice());
    }
}
