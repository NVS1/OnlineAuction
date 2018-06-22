package OnlineAuction;

public class SortingRunner {
    public static void main(String[] args) {
        User user = new User("Dima",new Account(10000));
        User user1 = new User("Vlad", new Account(20000));
        User user2 = new User("Vasya", new Account(15000));

        Product iphone = new Product("Iphone 5S", "like new",2,Category.SMARTPHONE);
        Product macBook = new Product("MacBook", "something",1,Category.COMPUTERS);
        Product samsung = new Product("Galaxy s8", "something",1,Category.SMARTPHONE);

        Lot lot1 = user.createLot(iphone,1000);
        Lot lot2 = user2.createLot(macBook, 3000);
        Lot lot3 = user.createLot(iphone,2000);
        Lot lot4 = user1.createLot(samsung,10000);
        Lot lot5 = user.createLot(macBook, 1200);
        Lot lot6 = user.createLot(samsung, 1500);
        Lot lot7 = user.createLot(samsung, 2500);
        Lot lot8 = user.createLot(iphone, 3500);

        AuctionsList lots = new AuctionsList();
        lots.addLot(lot1);
        lots.addLot(lot2);
        lots.addLot(lot3);
        lots.addLot(lot4);
        lots.addLot(lot5);
        lots.addLot(lot6);
        lots.addLot(lot7);
        lots.addLot(lot8);

        System.out.println(lots.filter(AuctionPredicates.hasPrice(1000,2000))); //1000,1200,1500,2000
        System.out.println(lots.filter(AuctionPredicates.nameContains("Gal")));
        System.out.println(lots.filter(AuctionPredicates.hasCategory(Category.COMPUTERS)));
    }
}
