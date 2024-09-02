package Mission;

import java.util.HashMap;
import java.util.Map;

public class BankDemo {
	
	// 계좌: 계좌 번호 + 계좌 객체
	public Map<String, Account> accountMap = new HashMap<>();
	
	// 고객: 고객 번호 + 고객 객체
	public Map<String, Customer> customerMap = new HashMap<>();
	
	// 은행별 입출금내역: 시퀀스 넘버 + 입출금 내역 객체
	public Map<String, Transaction> transactionMap = new HashMap<>();

	// 은행원: 직원 번호 + 은행원 객체
	public Map<String, Banker> bankerMap = new HashMap<>();
	
	public static void main(String[] args) {
	}

    public void withdraw(String accountNumber, String customerNumber, String password, long money) {
    	Account account = accountMap.get(accountNumber);
    	
    	if (account != null) {
    		if (account.customerNumber.equals(customerNumber) && account.password.equals(password)) {
    			if (account.balance >= money) {
    				account.balance -= money;
    			} else {
    				System.out.println("잔액이 부족합니다.");
    			}
    		} else {
    			System.out.println("고객 번호 및 비밀호가 일치하지 않습니다.");
    		}
    	} else {
    		System.out.println("계좌거 없습니다");
    	}
    }
}
