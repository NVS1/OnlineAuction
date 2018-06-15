package OnlineAuction;

public class Runner {
    public static void main(String[] args) {
        User user = new User("Valera",new Account(10000));
        User user1 = new User("Vlad", new Account(20000));
        User user2 = new User("Vasya", new Account(15000));
        Product product = new Product("Iphone 5S", "like new",1,Category.SMARTPHONE);
        Lot lot1 = user.createLot(product,1000);
        Lot lot2 = user2.createLot(product, 3000);
        Lot lot3 = user.createLot(product,2000);
        Lot lot4 = user1.createLot(product,10000);
        Lot lot5 = user.createLot(product, 1200);
        Lot lot6 = user.createLot(product, 1500);
        Lot lot7 = user.createLot(product, 2500);
        Lot lot8 = user.createLot(product, 3500);

        AuctionsList lots = new AuctionsList();
        lots.addLot(lot1);
        lots.addLot(lot2);
        lots.addLot(lot3);
        lots.addLot(lot4);
        lots.addLot(lot5);
        lots.addLot(lot6);
        lots.addLot(lot7);
        lots.addLot(lot8);
        System.out.println(lots.filter(AuctionPredicates.hasPrice(1000, 3000)));

    }
}
