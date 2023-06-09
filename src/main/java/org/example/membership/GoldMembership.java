package org.example.membership;

public class GoldMembership extends MembershipType {
    private static int maximumTrades = 20;


    public int getMaximumTrades() {
        return maximumTrades;
    }

    public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
        return dailyTradeNumber < this.getMaximumTrades();
    }
}
