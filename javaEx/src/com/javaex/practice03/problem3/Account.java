package com.javaex.practice03.problem3;

public class Account {

    private String accountNo;
    private int balance;
    
    Account(String accountNo) {
    	this.accountNo = accountNo;
    	balance = 0;
	}
    
    public void deposit(int amount) {
    	this.balance += amount;
    }
    
    public String getAccountNo() {
    	return accountNo;
    }
    
    public void withdraw(int amount) {
    	if (balance - amount < 0) {
    		System.out.println("잔액이 충분하지 않습니다.");
    		return;
    	}
    	balance -= amount;
    }
    
    public void showBalance() {
    	System.out.println(balance);
    }
	
}
