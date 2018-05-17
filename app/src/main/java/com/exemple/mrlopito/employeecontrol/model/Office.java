package com.exemple.mrlopito.employeecontrol.model;

public class Office {
    private long codeOffice;
    private String nameOffice;

    public Office(long codeOffice, String nameOffice) {
        this.codeOffice = codeOffice;
        this.nameOffice = nameOffice;
    }

    public long getCodeOffice() {
        return codeOffice;
    }

    public void setCodeOffice(long codeOffice) {
        this.codeOffice = codeOffice;
    }

    public String getNameOffice() {
        return nameOffice;
    }

    public void setNameOffice(String nameOffice) {
        this.nameOffice = nameOffice;
    }
}
