package HW_Lecture_5_6.Task_2_AirlineTicket;

import java.time.LocalTime;

public class FlightInfo {
    private final int flightNum;
    private final String placeDep;
    private final String placeArr;
    private final LocalTime timeDep;
    private final int placeNum;
    private final long price;

    public FlightInfo(int flightNum, String placeDep, String placeArr, LocalTime timeDep, int placeNum, long price) {
        this.flightNum = flightNum;
        this.placeDep = placeDep;
        this.placeArr = placeArr;
        this.timeDep = timeDep;
        this.placeNum = placeNum;
        this.price = price;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public String getPlaceDep() {
        return placeDep;
    }

    public String getPlaceArr() {
        return placeArr;
    }

    public LocalTime getTimeDep() {
        return timeDep;
    }

    public int getPlaceNum() {
        return placeNum;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "flightNum=" + flightNum +
                ", placeDep='" + placeDep + '\'' +
                ", placeArr='" + placeArr + '\'' +
                ", timeDep=" + timeDep +
                ", placeNum=" + placeNum +
                ", price=" + price +
                '}';
    }
}
