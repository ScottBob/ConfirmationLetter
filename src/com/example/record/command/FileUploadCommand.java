package com.example.record.command;

import com.example.record.domain.Record;

import java.util.ArrayList;
import java.util.List;

public class FileUploadCommand {
    public String getFee() {
        return "yes";
    }

    public List<Record> getTotalRecords() {
        return new ArrayList<>();
    }
}
