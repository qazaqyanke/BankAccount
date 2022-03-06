package com.qazaqyanke;

public class VipCustomer {
    private String customerName;
    private String emailAddress;
    private double creditLimit;

    public VipCustomer(){
        this("Default name", "VipCustomer@gold.com", 500000);
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, "unknown@email.com", creditLimit);
    }

    public VipCustomer(String customerName, String emailAddress, double creditLimit) {
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
