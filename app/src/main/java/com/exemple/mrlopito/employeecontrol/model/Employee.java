package com.exemple.mrlopito.employeecontrol.model;

import java.util.Date;

public class Employee {
    private long codeEmployee;
    private String nameEmployee;
    private String documentEmployee;
    private String emailEmployee;
    private Date admDateEmployee;
    private Double salaryEmployee;

    public Employee(long codeEmployee, String nameEmployee, String documentEmployee, String emailEmployee, Date admDateEmployee, Double salaryEmployee) {
        this.codeEmployee = codeEmployee;
        this.nameEmployee = nameEmployee;
        this.documentEmployee = documentEmployee;
        this.emailEmployee = emailEmployee;
        this.admDateEmployee = admDateEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public long getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(long codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDocumentEmployee() {
        return documentEmployee;
    }

    public void setDocumentEmployee(String documentEmployee) {
        this.documentEmployee = documentEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public Date getAdmDateEmployee() {
        return admDateEmployee;
    }

    public void setAdmDateEmployee(Date admDateEmployee) {
        this.admDateEmployee = admDateEmployee;
    }

    public Double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(Double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }
}
