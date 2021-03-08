package model;

import exception.InvalidPriceException;

public class Receipt {
    private double purchaseValue;
    private Card card;

    public Receipt(double purchaseValue, Card card) {
        if (purchaseValue < 0) {
            throw new InvalidPriceException("Price value is not valid!");
        }
        this.purchaseValue = purchaseValue;
        this.card = card;
    }

    private double calculateDiscount() {
        return purchaseValue * card.getDiscount() / 100;
    }

    private double getTotalValue() {
        return purchaseValue - calculateDiscount();
    }

    public void cashOut() {
        
        System.out.println("=====================");
        System.out.println("Value: $" + String.format("%.2f",purchaseValue));
        System.out.println("Discount Rate: " + card.getDiscount()+'%');
        System.out.println("Discount: $" + String.format("%.2f",calculateDiscount()));
        System.out.println("Total: $" + String.format("%.2f",getTotalValue()));
        System.out.println("=====================");
    }
}
