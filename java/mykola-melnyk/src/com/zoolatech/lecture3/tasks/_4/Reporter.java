package com.zoolatech.lecture3.tasks._4;

public abstract class Reporter {
    private final String headerData;
    private final String fileName;
    private final String fileData;

    public Reporter(String headerData, String fileData, String fileName) {
        this.fileData = fileData;
        this.fileName = fileName;
        this.headerData = headerData;
    }

    public String getHeaderData() {
        return headerData;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileData() {
        return fileData;
    }

    public void generate() {
        createFile();
        addHeaderData();
        addFileData();
        closeFile();
    }
    public abstract void createFile();
    public abstract void addHeaderData();
    public abstract void addFileData();
    public abstract void closeFile();




}