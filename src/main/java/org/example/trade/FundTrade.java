package org.example.trade;

public class FundTrade extends Trade{
    private double dividendRate;

    public FundTrade(String id, String symbol, int quantity, double price, double dividendRate) {
        super(id, symbol, quantity, price);
        this.dividendRate = dividendRate;
        super.setDividend(calcDividend());
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
        this.setDividend(calcDividend());
    }


    public double getDividend() {
        return super.getDividend();
    }

    public double calcDividend() {
        return this.dividendRate * super.getPrice();
    }


    public String toString() {
        return super.toString() + ", Dividend: " + calcDividend();
    }
}