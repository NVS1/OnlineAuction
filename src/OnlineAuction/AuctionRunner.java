package OnlineAuction;

public class AuctionRunner {
    public static void main(String[] args) {
        User user = new User("Vlad",new Account(10000));
        User user1 = new User("Andrew", new Account(12000));
        User user2 = new User("Dima", new Account(15000));

        Lot lot = user.createLot(new Product("Iphone 6", "something", 1,Category.SMARTPHONE),2000);

        user1.placeBid(3000,lot);
        user2.placeBid(5000,lot);
        user1.placeBid(6000, lot);

        System.out.println(lot);

        while(lot.getStatus()!=Status.FINISHED){
            System.out.println(lot.getWinner());
            System.out.println(user.getSales());
            System.out.println(user1.getPurchase());
        }
    }
}
