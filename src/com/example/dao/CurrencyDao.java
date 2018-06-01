package com.example.dao;

import com.example.domain.*;

public class CurrencyDao implements Currency {
    String currencyID = "currencyID";
    String currencyCode = Currency.DOLLARS;
    String currencyType = Currency.DOLLARS;
    private String code;

    public String retrieveCurrencyDefault(Profile profile) {
        if (profile == null) {
            return "NullProfile";
        }
        return currencyID;
    }

    public Currency retrieveCurrencyOnId(Integer id) {
        switch (id) {
            case Currency.ID_DOLLARS:
                return new Dollars();
            default:
                return new Euros();
        }
    }

    @Override
    public String getCode() {
        return currencyCode;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getCurrencyType() {
        return currencyType;
    }

    @Override
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    @Override
    public String toString() {
        return "CurrencyDao{" + System.lineSeparator() +
                "currencyID='" + currencyID + '\'' + System.lineSeparator() +
                ", currencyCode='" + currencyCode + '\'' + System.lineSeparator() +
                ", currencyType='" + currencyType + '\'' + System.lineSeparator() +
                ", code='" + code + '\'' + System.lineSeparator() +
                '}';
    }
}
