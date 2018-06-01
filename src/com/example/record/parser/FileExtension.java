package com.example.record.parser;

public class FileExtension {

    private final String extensionString;

    @Override
    public String toString() {
        return "FileExtension{" + System.lineSeparator() +
                "extensionString='" + extensionString + '\'' + System.lineSeparator() +
                '}';
    }

    public FileExtension(String extensionString) {
        this.extensionString = extensionString;
    }
}
