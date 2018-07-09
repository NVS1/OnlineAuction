package OnlineAuction.IO;

import OnlineAuction.AuctionsList;

import java.io.*;

public class LotsTextIO {
    public static void writeText (String fileName, AuctionsList auctionsList) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(String.valueOf(auctionsList));
        bufferedWriter.close();
    }
}
