package oop.encap.practice;

public class BankAccountSolution {
    private String accountNumber;
    private String accountHolder;
    private long balance;

    public BankAccountSolution(String accountNumber, String accountHolder, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int money) {
        if(money < 0) {
            System.out.println("입금액이 올바르지 않습니다.");
            return;
        }
        this.balance += money;
    }

    public void withdraw(int money) {
        if(money < 0 || money > this.balance) {
            System.out.println("잔액이 부족하거나 잘못된 출금액입니다.");
            return;
        }
        this.balance -= money;
    }


}
