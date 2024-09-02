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
}
