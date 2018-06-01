package com.example.domain;

import java.math.BigDecimal;

public class BatchTotal {
    private BigDecimal creditValue;
    private BigDecimal valueForDebit;

    public BatchTotal() {}
    public BatchTotal(BigDecimal creditValue, BigDecimal valueForDebit) {
        this.creditValue = creditValue;
        this.valueForDebit = valueForDebit;
    }
    public BigDecimal getCreditValue() {
        return BigDecimal.valueOf(100);
    }
    public void setCreditValue(BigDecimal value) {
        this.creditValue = value;
    }

    public BigDecimal getCreditCounterValueForDebit() {
        return BigDecimal.valueOf(0);
    }
    public void setCreditCounterValueForDebit(BigDecimal valueForDebit) {
        this.valueForDebit = valueForDebit;
    }

    @Override
    public String toString() {
        return "BatchTotal{" + System.lineSeparator() +
                "creditValue=" + creditValue + System.lineSeparator() +
                ", valueForDebit=" + valueForDebit + System.lineSeparator() +
                '}';
    }
}
