package com.cognizant.Loan.model;

public class Loan {
    private String number;
    private String type;
    private double loan;
    private double emi;
    private int tenure;

    public Loan() {
    }

    public Loan(double emi, double loan, String number, int tenure, String type) {
        this.emi = emi;
        this.loan = loan;
        this.number = number;
        this.tenure = tenure;
        this.type = type;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
