package com.driver;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("AccioJob", 10000, 500, 10);
        System.out.println("Simple Interest after 10 years is " + savingsAccount.getSimpleInterest(10));
        System.out.println("Compound Interest after 2 years at 1 times per year is " + savingsAccount.getCompoundInterest(1, 2));
        Double val1 = Double.valueOf(12100.000000000001);
        System.out.println(val1.equals(savingsAccount.getCompoundInterest(1, 2)));
    }
}