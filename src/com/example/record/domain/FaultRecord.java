package com.example.record.domain;

import com.example.domain.Bank;
import com.example.domain.Currency;

import java.math.BigDecimal;

public class FaultRecord implements Record {
    private String creditDebit;
    private String currencyCode;
    private Currency currency;
    private Bank bank = new Bank("Bank of America");
    private int accountNumber = 12345;
    private BigDecimal amount = BigDecimal.valueOf(0);
    private Integer freeRecord = 0;
    private Integer isCounterTransferRecord = 0;
    private String beneficiaryName = "";

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

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public Integer getIsCounterTransferRecord() {
        return isCounterTransferRecord;
    }

    @Override
    public void setIsCounterTransferRecord(Integer isCounterTransferRecord) {
        this.isCounterTransferRecord = isCounterTransferRecord;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    @Override
    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
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
    public void setBeneficiaryAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "FaultRecord{" + System.lineSeparator() +
                "creditDebit='" + creditDebit + '\'' + System.lineSeparator() +
                ", currencyCode='" + currencyCode + '\'' + System.lineSeparator() +
                ", currency=" + currency + System.lineSeparator() +
                ", bank=" + bank + System.lineSeparator() +
                ", accountNumber=" + accountNumber + System.lineSeparator() +
                ", amount=" + amount + System.lineSeparator() +
                ", freeRecord=" + freeRecord + System.lineSeparator() +
                ", isCounterTransferRecord=" + isCounterTransferRecord + System.lineSeparator() +
                ", beneficiaryName='" + beneficiaryName + '\'' + System.lineSeparator() +
                '}';
    }
}
