package com.example.record.domain;

import com.example.domain.Bank;
import com.example.domain.Currency;

import java.math.BigDecimal;

public interface Record {
    public Currency getCurrency();
    public void setCurrency(Currency currency);

    public Integer getFeeRecord();
    public void setFreeRecord(Integer freeRecord);

    public String getSign();
    public void setSign(String creditDebit);

    public BigDecimal getAmount();
    public void setAmount(BigDecimal amount);

    public String getCurrencyCode();
    public void setCurrencyCode(String currencyCode);

    public Integer getIsCounterTransferRecord();
    public void setIsCounterTransferRecord(Integer isCounterTransferRecord);

    public String getBeneficiaryName();
    public void setBeneficiaryName(String beneficiaryName);

    public Bank getBank();
    public void setBank(Bank bank);

    public int getBeneficiaryAccountNumber();
    public void setBeneficiaryAccountNumber(Integer beneficiaryAccountNumber);
}
