package com.example.domain;

import com.example.record.domain.Record;

import java.math.BigDecimal;
import java.util.List;

public class AmountAndRecordsPerBank {
    Bank bank;
    private int totalRecord;
    private BigDecimal amount;
    private String currencyType;
    private int accountNumber;
    private String bankName;

    public AmountAndRecordsPerBank() {
        bank = new Bank();
    }
    public void setBankName(String name) {
        bank.setName(name);
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getTotalRecord() {
        return totalRecord;
    }
}
