package HW_Lecture_5_6.Task_2_AirlineTicket;

public class PassengerInfo {
    private final String firstName;
    private final String secondName;
    private final String numOfPassport;

    public PassengerInfo(String firstName, String secondName, String numOfPassport) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.numOfPassport = numOfPassport;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getNumOfPassport() {
        return numOfPassport;
    }

    @Override
    public String toString() {
        return "PassengerInfo{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", numOfPassport='" + numOfPassport + '\'' +
                '}';
    }
}
