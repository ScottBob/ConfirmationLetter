package com.example.record.command;

import com.example.record.domain.Record;

import java.util.ArrayList;
import java.util.List;

public class FileUploadCommand {
    String fee = "yes";

    public void setFee(String fee) { this.fee = fee;}
    public String getFee() {
        return fee;
    }

    public List<Record> getTotalRecords() {
        return new ArrayList<>();
    }
}
