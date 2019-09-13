package com.example.domain;

import com.example.record.service.impl.Constants;

public class Client {
    String creditDebit = " ";
    private Profile profile = new Profile();
    private String counterTransfer;
    private double amountDivider;

    public String getCreditDebit() {
        return creditDebit;
    }
    public void setCreditDebit(String creditDebit) {
        this.creditDebit = creditDebit;
    }

    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getCounterTransfer() {
        return Constants.TRUE;
    }
    public void setCounterTransfer(String counterTransfer) {
        this.counterTransfer = counterTransfer;
    }

    public double getAmountDivider() {
        return 10;
    }
    public void setAmountDivider(double amountDivider) {
        this.amountDivider = amountDivider;
    }

    @Override
    public String toString() {
        return "Client{" +
                "creditDebit='" + creditDebit + '\'' +
                ", profile=" + profile +
                ", counterTransfer='" + counterTransfer + '\'' +
                ", amountDivider=" + amountDivider +
                '}';
    }
}
