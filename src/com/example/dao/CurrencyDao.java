package com.example.dao;

import com.example.domain.*;

public class CurrencyDao extends Currency {
    public CurrencyDao() {

    }

    public String retrieveCurrencyDefault(Profile profile) {
        if (profile == null) {
            return "NullProfile";
        }
        return profile.getDefaultCurrency().getCurrencyType();
    }

    public Currency retrieveCurrencyOnId(Integer id) {
        switch (id) {
            case Currency.ID_DOLLARS:
                return new Dollars();
            case Currency.ID_POUND:
                return new Pound();
            case Currency.ID_YEN:
                return new Yen();
            case Currency.ID_EURO:
                return new Euros();
            default:
                return new Dollars();
        }
    }
}
