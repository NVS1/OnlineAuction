package Task_2_AirlineTicket;

public class Baggage implements Service {
    private final long bagPrice;
    private final int bagNum;

    public Baggage(long bagPrice, int bagNum) {
        this.bagPrice = bagPrice;
        this.bagNum = bagNum;
    }

    public long getBagPrice() {
        return bagPrice;
    }

    public int getBagNum() {
        return bagNum;
    }

    @Override
    public long getPrice() {
        return bagPrice*(long)bagNum;
    }
}
