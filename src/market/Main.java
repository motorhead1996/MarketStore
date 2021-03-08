package market;

import model.BronzeCard;
import model.GoldCard;
import model.Card;
import model.Receipt;
import model.SilverCard;

public class Main {
    public static void main(String[] args) {
        final Card bronzeCard = new BronzeCard("Bronze Card", 0);
        final Card silverCard = new SilverCard("Silver Card", 600);
        final Card goldenCard = new GoldCard("Golden Card ", 300);

        final Receipt bronzeReceipt = new Receipt(150, bronzeCard);
        final Receipt silverReceipt = new Receipt(850, silverCard);
        final Receipt goldenReceipt = new Receipt(1000, goldenCard);
        
        bronzeReceipt.cashOut();
        silverReceipt.cashOut();
        goldenReceipt.cashOut();
    }
}
