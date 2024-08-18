package oop.encap;

public class BankAccount {
    private int balance;
    private String accountNumber;
    private String accoungHolder;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccoungHolder() {
        return accoungHolder;
    }

    public void setAccoungHolder(String accoungHolder) {
        this.accoungHolder = accoungHolder;
    }



    public BankAccount(String accountNumber, String accountHolder, int balance){
        this.accountNumber = accountNumber;
        this.accoungHolder = accountHolder;
        this.balance = balance;

    }

    public int deposit(int money) {
        balance += money;
        return balance;
    }

    public int withdraw(int money) {
        balance -= money;
        return money;
    }

}
