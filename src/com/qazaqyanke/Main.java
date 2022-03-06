package com.qazaqyanke;

public class Main {

    public static void main(String[] args) {
	    BankAccount JohnDoeBank = new BankAccount(12345, 0.00, "John Doe", "JohnDoe@unknow.com", "55-333-57-59");
        JohnDoeBank.deposit(50.0);
        JohnDoeBank.withdrawal(41.0);

        System.out.println(JohnDoeBank.getAccountNumber());
        System.out.println(JohnDoeBank.getBalance());
        System.out.println(JohnDoeBank.getCustomerName());
        System.out.println(JohnDoeBank.getEmail());
        System.out.println(JohnDoeBank.getPhoneNumber());


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getCustomerName());

        VipCustomer person2 = new VipCustomer("Bob", 250000);
        System.out.println(person2.getCustomerName());
        System.out.println(person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("Alex", "Luxirylife@email.com", 500000);
        System.out.println(person3.getCustomerName());
        System.out.println(person3.getEmailAddress());
        System.out.println(person3.getCreditLimit());
    }
}
