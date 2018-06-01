package com.example.domain;

public class CurrencyCode {
    String code;
    public CurrencyCode(String currencyType) {
        code = currencyType;
    }

    @Override
    public String toString() {
        return code;
    }
}
