package beginnerJava.src.ch11;

public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);

        try {
            account.withdraw(30000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}

class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔고 부족");
        }

        balance -= money;
    }
}

class InsufficientException extends Exception {
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        // 예외 객체의 공통 메소드인 getMessage()의 리턴값으로 사용
        super(message);
    }
}