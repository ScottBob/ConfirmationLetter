package com.example.domain;

public interface Currency {
    public static final String DOLLARS = "Dollars";
    public static final String POUND = "Pound";
    public static final String YEN = "Yen";
    public static final String EURO = "Euro";
    public static final int ID_DOLLARS = 0;

    public String getCode();
    public void setCode(String code);

    public String getCurrencyType();
    public void setCurrencyType(String currencyType);
}
