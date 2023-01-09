package org.brightology;

public class Main {
    public static void main(String[] args) {
        Account Ezeugo = new Account("2020303030", 0.00, "Ezeugo",
                "ezeugo@gmail.com", "08011222333");

        Ezeugo.depositMoney(1000);
        Ezeugo.cashWithdrawal(100);
        Ezeugo.checkBalance();
        Ezeugo.cashWithdrawal(700);
        Ezeugo.checkBalance();
        System.out.println(Ezeugo.getNumber());
    }
}