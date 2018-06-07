package HW_Lecture_5_6.Task_2_AirlineTicket;

public class Meal implements Service {
    private final String typeFood;
    private final boolean isBeverage;
    private final long price;

    public Meal(String typeFood, boolean isBeverage, long price) {
        this.typeFood = typeFood;
        this.isBeverage = isBeverage;
        this.price = price;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public boolean isBeverage() {
        return isBeverage;
    }

    @Override
    public long getPrice() {
        return price;
    }
}

