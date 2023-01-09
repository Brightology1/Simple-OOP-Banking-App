package org.brightology;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account(String number, double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(double depositedMoney){
        this.balance += depositedMoney;
        System.out.println("Your cash deposit is was successfully, your new balance is " + this.balance);
    }

    public void cashWithdrawal(double cashWithdrawal){
        if(this.balance - cashWithdrawal < 0){
            System.out.println("Insufficient Balance, your current balance is " + this.balance);
        } else {
            this.balance -= cashWithdrawal;
            System.out.println("Cash withdrawal was successfully, your current balance is " + this.balance);
        }
    }

    public void checkBalance(){
        System.out.println("your current balance is " + this.balance);
    }
}
