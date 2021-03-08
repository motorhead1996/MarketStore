package model;

import exception.InvalidNameException;
import exception.InvalidTurnoverException;

public abstract class Card {

    protected String ownerName;
    protected double turnover;

    public Card(String ownerName, double turnover) {
        if (turnover < 0) {
            throw new InvalidTurnoverException("Turnover value is invalid");
        }

        if (!isFullname(ownerName)) {
            throw new InvalidNameException("OwnerName is not valid. Enter Full Name.");
        }
        this.ownerName = ownerName;
        this.turnover = turnover;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public abstract double getDiscount();

    private boolean isFullname(String name) {
        String expression = "^[a-zA-Z\\s]+";
        return name.matches(expression);
    }
}
