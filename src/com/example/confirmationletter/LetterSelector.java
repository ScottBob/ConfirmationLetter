package com.example.confirmationletter;

import com.example.domain.ConfirmationLetter;
import com.example.domain.TransactionType;

public class LetterSelector {
    public OurOwnByteArrayOutputStream generateLetter(String creditDebit, ConfirmationLetter letter) {
        OurOwnByteArrayOutputStream os = new OurOwnByteArrayOutputStream();
        os.setCreditDebit(creditDebit);
        os.setConfirmationLetter(letter);
        return os;
    }
}
