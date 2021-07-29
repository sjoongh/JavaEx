package test;

public class Account { 
	// 필드
	private String accountNo;
	private int balance;
	
	// 생성자 생성
	Account(String accountNo) {
		this.accountNo = accountNo;
		balance = 0;
	}
	
	// 필요한 메소드 작성
	public void deposit(int amount) { // 입금
		this.balance += amount;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void withdraw(int amount) { // 출금
		if (balance - amount < 0) {
			System.out.println("잔액이 충분하지 않습니다.");
			return;
		}
		balance -= amount;
	}
	
	public void showBalance() { // 잔고 보여주기
		System.out.println(balance);
	}
}
