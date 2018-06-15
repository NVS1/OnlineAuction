package OnlineAuction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Lot {
    private final long TIME_AUCTION_HOUR = 36;
    private final String id = UUID.randomUUID().toString();
    private final Product product;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private long currentPrice;
    private final User owner;
    private User currentWinner;
    private final List<Bid> bids = new ArrayList<>();
    private User winner;

    public Lot(Product product, long startingPrice, User owner) {
        this.product = product;
        this.startTime = LocalDateTime.now();
        this.endTime = startTime.plusHours(TIME_AUCTION_HOUR);
        this.currentPrice = startingPrice;
        this.owner = owner;
        this.currentWinner = null;
        this.winner = null;
    }

    public boolean addBid(Bid bid) {
        if (checkBid(bid)) return false;
        if (currentWinner != null){
            currentWinner.getAccount().debit(currentPrice);
        }
        currentPrice = bid.getMoney();
        currentWinner = bid.getUser();
        bids.add(bid);
        return true;
    }

    public Lot identifyWinner() {
        if (endTime.equals(LocalDateTime.now())) {
            if (currentWinner == null) {
                System.out.println("Winner undefined");
            } else {
                this.winner = currentWinner;
                winner.getPurchase().add(this);
                owner.getSales().add(this);
                System.out.println("Winner is "+winner.getName());
            }
        }
        return this;
    }

    public Product getProduct() {
        return product;
    }

    private boolean checkBid(Bid bid) throws IllegalArgumentException {
        if (bid.getUser() == owner || bid.getMoney() <= currentPrice || winner != null || currentWinner==bid.getUser()) {
            throw new IllegalArgumentException("Error");
        }
        boolean success = bid.getUser().getAccount().withdraw(bid.getMoney());
        if (!success) {
            return true;
        }
        return false;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public User getOwner() {
        return owner;
    }

    public User getCurrentWinner() {
        return currentWinner;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public User getWinner() {
        return winner;
    }

    public List<Bid> getBids() {
        List<Bid> temp = new ArrayList<>(bids);
        return temp;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Lot{" +
                "product=" + product +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", currentPrice=" + currentPrice +
                ", winner=" + winner +
                '}';
    }
}

