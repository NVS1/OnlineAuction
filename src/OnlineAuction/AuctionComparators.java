package OnlineAuction;

import java.util.Comparator;

public class AuctionComparators {
    public static Comparator<Lot> byName(){
       Comparator<Lot> comparator = new Comparator<Lot>() {
            @Override
            public int compare(Lot o1, Lot o2) {
                return o1.getProduct().getName().compareTo(o2.getProduct().getName());
            }
        };
       return comparator;
    }
    public static Comparator<Lot> byStartTime(){
        Comparator<Lot> comparator = new Comparator<Lot>() {
            @Override
            public int compare(Lot o1, Lot o2) {
                return o1.getStartTime().compareTo(o2.getStartTime());
            }
        };
        return comparator;
    }
    public static Comparator<Lot> byNumberBids(){
        Comparator<Lot> comparator = new Comparator<Lot>() {
            @Override
            public int compare(Lot o1, Lot o2) {
                return o1.getBids().size()-o2.getBids().size();
            }
        };
        return comparator;
    }
    public static Comparator<Lot> byPrice(){
        Comparator<Lot> comparator = new Comparator<Lot>() {
            @Override
            public int compare(Lot o1, Lot o2) {
                return (int)(o1.getCurrentPrice()-o2.getCurrentPrice());
            }
        };
        return comparator;
    }

}
