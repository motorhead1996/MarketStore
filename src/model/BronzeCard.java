package model;

public class BronzeCard extends Card {

    public BronzeCard(String ownerName, double turnover) {
        super(ownerName, turnover);
    }

    @Override
    public double getDiscount() {
        if (turnover < 100) {
            return 0;
        }

        if (turnover>=100 && turnover <= 300) {
            return 1;
        }

        return 2.5;
    }

}
