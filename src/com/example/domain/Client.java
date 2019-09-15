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
    // CREDIT or DEBIT
    public void setCreditDebit(String creditDebit) {
        this.creditDebit = creditDebit;
    }

    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    // TRUE or FALSE
    public String getCounterTransfer() {
        return counterTransfer;
    }
    public void setCounterTransfer(String counterTransfer) {
        this.counterTransfer = counterTransfer;
    }

    public double getAmountDivider() {
        return amountDivider;
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
