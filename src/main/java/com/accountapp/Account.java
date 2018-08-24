package com.accountapp;

public class Account {
    private String firstName;
    private String lastName;
    private String accountNumber;

    public Account(String firstName, String lastName, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }
    @Override
    public String toString() {
        return "com.accountapp.Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
