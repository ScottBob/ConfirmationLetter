package com.example.record.domain;

import com.example.domain.Bank;
import com.example.domain.Currency;
import com.example.domain.Euros;

import java.math.BigDecimal;

public class TempRecord implements Record {
    private String creditDebit = "";
    private String currencyCode = "";
    private Currency currency = new Euros();
    private Bank bank = new Bank("Chase Bank");
    private int accountNumber = 0;
    private BigDecimal amount = BigDecimal.valueOf(0);
    private Integer freeRecord = 0;
    private Integer isCounterTransferRecord = 0;
    private String beneficiaryName = "";
    private Integer beneficiaryAccountNumber = 0;

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Integer getFeeRecord() {
        return freeRecord;
    }

    @Override
    public void setFreeRecord(Integer freeRecord) {
        this.freeRecord = freeRecord;
    }

    public String getSign() {
        return creditDebit;
    }
    public void setSign(String creditDebit) {
        this.creditDebit = creditDebit;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencycode) {
        this.currencyCode = currencycode;
    }

    public Integer getIsCounterTransferRecord() {
        return isCounterTransferRecord;
    }

    @Override
    public void setIsCounterTransferRecord(Integer isCounterTransferRecord) {

    }

    @Override
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    @Override
    public void setBeneficiaryName(String beneficiaryName) {

    }

    public Bank getBank() {
        return bank;
    }

    @Override
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getBeneficiaryAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setBeneficiaryAccountNumber(Integer beneficiaryAccountNumber) {
        this.beneficiaryAccountNumber = beneficiaryAccountNumber;
    }
}
