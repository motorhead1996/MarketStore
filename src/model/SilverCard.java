package model;


public class SilverCard extends Card {

    public SilverCard(String ownerName, double turnover) {
        super(ownerName, turnover);
    }

    @Override
    public double getDiscount() {
        if (turnover > 300) {
            return 3.5;
        } else {
            return 2;
        }
    }
}
