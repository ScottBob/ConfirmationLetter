package com.example.domain;

public class Bank {
    String name;
    public Bank() {
        name = "";
    }

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
