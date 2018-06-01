package com.example.domain;

public class TransactionType implements CharSequence {
    String tt = "+- ";
    @Override
    public int length() {
        return tt.length();
    }

    @Override
    public char charAt(int index) {
        return tt.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return tt.subSequence(start, end);
    }
}
