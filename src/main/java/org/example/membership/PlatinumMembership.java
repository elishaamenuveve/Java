package org.example.membership;

public class PlatinumMembership extends MembershipType{
    @Override
    public int getMaximumTrades() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
        return false;
    }
}
