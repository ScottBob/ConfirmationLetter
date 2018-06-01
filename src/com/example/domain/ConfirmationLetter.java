package com.example.domain;

import com.example.record.domain.FaultRecord;
import com.example.record.domain.Record;
import com.example.record.parser.FileExtension;

import java.math.BigDecimal;
import java.util.List;

public class ConfirmationLetter {
    FileExtension fileExtension;
    Currency currency;
    String hashTotalCredit;
    String hashTotalDebit;
    String batchTotalDebit;
    String batchTotalCredit;
    String totalProcessedRecords;
    private String transactionCost;
    private String collectionType;
    private List<AmountAndRecordsPerBank> bankMap;
    private List<FaultRecord> creditingErrors;
    private Client client;
    private String branchName;
    private BigDecimal retrievedAmountEuro;
    private BigDecimal retrievedAmountFL;
    private BigDecimal retrievedAmountUSD;
    private List<Record> totalRecords;

    public void setExtension(FileExtension extension) {
        fileExtension = extension;
    }

    public Currency setCurrency(Currency currency) {
        currency = currency;
        return currency;
    }

    public void setHashTotalCredit(String hashTotalCredit) {
        this.hashTotalCredit = hashTotalCredit;
    }

    public void setHashTotalDebit(String hashTotalDebit) {
        this.hashTotalDebit = hashTotalDebit;
    }

    public void setBatchTotalDebit(String batchTotalDebit) {
        this.batchTotalDebit = batchTotalDebit;
    }

    public void setBatchTotalCredit(String batchTotalCredit) {
        this.batchTotalCredit = batchTotalCredit;
    }

    public void setTotalProcessedRecords(String totalProcessedRecords) {
        this.totalProcessedRecords = totalProcessedRecords;
    }

    public void setTransactionCost(String transactionCost) {
        this.transactionCost = transactionCost;
    }

    public void setTransferType(String collectionType) {
        this.collectionType = collectionType;
    }

    public void setBanks(List<AmountAndRecordsPerBank> bankMap) {
        this.bankMap = bankMap;
    }

    public void setCreditingErrors(List<FaultRecord> faultyRecords) {
        this.creditingErrors = faultyRecords;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setRetrievedAmountEur(BigDecimal retrievedAmount) {
        this.retrievedAmountEuro = retrievedAmount;
    }

    public void setRetrievedAmountFL(BigDecimal retrievedAmount) {
        this.retrievedAmountFL = retrievedAmount;
    }

    public void setRetrievedAmountUsd(BigDecimal retrievedAmount) {
        this.retrievedAmountUSD = retrievedAmount;
    }

    public void setTotalRetrievedRecords(List<Record> totalRecords) {
        this.totalRecords = totalRecords;
    }

    @Override
    public String toString() {
        return "ConfirmationLetter{" + System.lineSeparator() +
                "fileExtension=" + fileExtension + System.lineSeparator() +
                ", currency=" + currency + System.lineSeparator() +
                ", hashTotalCredit='" + hashTotalCredit + '\'' + System.lineSeparator() +
                ", hashTotalDebit='" + hashTotalDebit + '\'' + System.lineSeparator() +
                ", batchTotalDebit='" + batchTotalDebit + '\'' + System.lineSeparator() +
                ", batchTotalCredit='" + batchTotalCredit + '\'' + System.lineSeparator() +
                ", totalProcessedRecords='" + totalProcessedRecords + '\'' + System.lineSeparator() +
                ", transactionCost='" + transactionCost + '\'' + System.lineSeparator() +
                ", collectionType='" + collectionType + '\'' + System.lineSeparator() +
                ", bankMap=" + bankMap + System.lineSeparator() +
                ", creditingErrors=" + creditingErrors + System.lineSeparator() +
                ", client=" + client + System.lineSeparator() +
                ", branchName='" + branchName + '\'' + System.lineSeparator() +
                ", retrievedAmountEuro=" + retrievedAmountEuro + System.lineSeparator() +
                ", retrievedAmountFL=" + retrievedAmountFL + System.lineSeparator() +
                ", retrievedAmountUSD=" + retrievedAmountUSD + System.lineSeparator() +
                ", totalRecords=" + totalRecords + System.lineSeparator() +
                '}';
    }
}
