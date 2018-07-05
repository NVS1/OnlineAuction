package OnlineAuction.Runners;

import OnlineAuction.*;
import OnlineAuction.Enums.Category;
import OnlineAuction.Enums.Status;

public class AuctionRunner {
    public static void main(String[] args) {
        User user = new User("Vlad",new Account(10000));
        User user1 = new User("Andrew", new Account(12000));
        User user2 = new User("Dima", new Account(15000));

        Lot lot = user.createLot(new Product("Iphone 6", "something", 1, Category.SMARTPHONE),2000);

        user1.placeBid(3000,lot);
        user2.placeBid(5000,lot);
        user1.placeBid(6000, lot); //Winning Andrew

        System.out.println("Purchase");
        System.out.println(user1.getPurchase());
        System.out.println("Sales");
        System.out.println(user.getSales());

        while(lot.getStatus()!= Status.FINISHED){ // Start Auction (5 sec)
            lot.computeWinner();
        }
        System.out.println("Winner is "+lot.getWinner());
        System.out.println("Purchase after ending auction");
        System.out.println(user1.getPurchase());
        System.out.println("Sales after ending auction");
        System.out.println(user.getSales());
    }
}
