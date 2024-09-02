package Mission;

import java.time.LocalDate;

public class Account {
    BankCode bankCode;				// 은행코드
    String accountNumber;			// 계좌번호 5자
    String customerNumber;			// 고객번호 주민번호 앞자리 6자
    LocalDate accountOpenDate;		// 계좌 개설 일자
    LocalDate accountColoseDate;	// 계좌 삭제 일자
    Boolean isDormantt;   			// 휴면 계좌 여부
    String password;     			// 비밀번호
    long balance;        			// 잔고
    
    // 계좌 생성
    public Account(BankCode bankCode,
    			   int accountCounter,
    			   String customerNumber,  
    			   String password) {
    	this.bankCode = bankCode;
    	this.accountNumber = String.format("%05d", accountCounter);
    	this.customerNumber = customerNumber;
    	this.accountOpenDate = LocalDate.now();
    	this.accountColoseDate = null;
    	this.isDormantt = false;
    	this.password = password;
    	this.balance = 0;
    }
}
