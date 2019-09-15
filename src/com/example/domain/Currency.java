package com.example.domain;

public class Currency {
    public static final String DOLLARS = "Dollars";
    public static final String POUND = "Pound";
    public static final String YEN = "Yen";
    public static final String EURO = "Euro";
    public static final int ID_DOLLARS = 0;
    public static final int ID_POUND = 1;
    public static final int ID_YEN = 2;
    public static final int ID_EURO = 3;

    Integer code;
    String currencyType;

    public String getCode() {
        return String.valueOf(code);
    };

    public String getCurrencyType() {
        return currencyType;
    };

    @Override
    public String toString() {
        return "Currency{" +
                "code=" + code +
                ", currencyType='" + currencyType + '\'' +
                '}';
    }
}
