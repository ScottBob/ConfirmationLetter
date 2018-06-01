package com.example.domain;

import java.util.HashMap;
import java.util.Map;

public class HashBatchRecordsBalance {
    Double hashTotalCredit;
    Double hashTotalDebit;
    Double recordsTotal;
    Double totalFee;
    Map<Integer, BatchTotal> batchTotals = new HashMap<>();
    private String collectionType;

    public Double getHashTotalCredit() {
        return hashTotalCredit;
    }
    public void setHashTotalCredit(Double hashTotalCredit) {
        this.hashTotalCredit = hashTotalCredit;
    }

    public Double getHashTotalDebit() {
        return hashTotalDebit;
    }
    public void setHashTotalDebit(Double hashTotalDebit) {
        this.hashTotalDebit = hashTotalDebit;
    }

    public Map<Integer,BatchTotal> getBatchTotals() {
        return batchTotals;
    }
    public void setBatchTotals(Map<Integer, BatchTotal> batchTotals) {
        this.batchTotals = batchTotals;
    }

    public Double getRecordsTotal() {
        return recordsTotal;
    }
    public void setRecordsTotal(Double recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Double getTotalFee() {
        return totalFee;
    }
    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public String getCollectionType() {
        return collectionType;
    }
    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }
}
