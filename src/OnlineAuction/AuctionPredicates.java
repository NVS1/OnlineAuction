package OnlineAuction;

import java.util.function.Predicate;

public class AuctionPredicates {
    public static Predicate<Lot> nameContains(String substring){
        Predicate<Lot> predicate = new Predicate<Lot>() {
            @Override
            public boolean test(Lot lot) {
                return lot.getProduct().getName().startsWith(substring);
            }
        };
        return predicate;
    }
    public static Predicate<Lot> hasCategory (Category category){
        Predicate<Lot> predicate = new Predicate<Lot>() {
            @Override
            public boolean test(Lot lot) {
                return lot.getProduct().getCategory().equals(category);
            }
        };
        return predicate;
    }
    public static Predicate<Lot> hasPrice(long from, long to){
        Predicate<Lot> predicate = new Predicate<Lot>() {
            @Override
            public boolean test(Lot lot) {
                return lot.getCurrentPrice()>=from && lot.getCurrentPrice()<=to;
            }
        };
        return predicate;
    }
}
