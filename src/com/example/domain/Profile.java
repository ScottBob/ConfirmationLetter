package com.example.domain;

public class Profile {
    public Currency getDefaultCurrency() {
        return new Dollars();
    }

    @Override
    public String toString() {
        return "Profile{ defaultCurrency = 'Dollars' }";
    }
}
