package com.example.confirmationletter;

import com.example.domain.ConfirmationLetter;

import java.io.ByteArrayOutputStream;

public class OurOwnByteArrayOutputStream extends ByteArrayOutputStream {
    private String creditDebit;
    private ConfirmationLetter confirmationLetter;

    public void setCreditDebit(String creditDebit) {
        this.creditDebit = creditDebit;
    }

    public void setConfirmationLetter(ConfirmationLetter confirmationLetter) {
        this.confirmationLetter = confirmationLetter;
    }

    @Override
    public String toString() {
        return "OurOwnByteArrayOutputStream{" + System.lineSeparator() +
                "creditDebit='" + creditDebit + '\'' + System.lineSeparator() +
                ", confirmationLetter=" + confirmationLetter.toString() + System.lineSeparator() +
                '}';
    }
}
