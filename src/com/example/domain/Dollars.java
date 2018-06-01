package com.example.domain;

public class Dollars implements Currency {

    private String code;
    private String currencyType;

    @Override
    public String getCode() {
        return Currency.DOLLARS;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getCurrencyType() {
        return Currency.DOLLARS;
    }

    @Override
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    @Override
    public String toString() {
        return "Dollars{" + System.lineSeparator() +
                "code='" + code + '\'' + System.lineSeparator() +
                ", currencyType='" + currencyType + '\'' + System.lineSeparator() +
                '}';
    }
}
