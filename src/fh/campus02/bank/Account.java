package fh.campus02.bank;

import java.util.Objects;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;
    private static int uniqueID = 1;

    public Account(String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        accountID = uniqueID++;
        balance = 0;
    }

    public int getAccountID() {
        return accountID;
    }

    public void add(double value) {
        balance = balance + value;
    }

    public double deposit(double value) {
        if (value >= 0) {
            if (value < balance) {
                balance = balance - value;
            } else {
                value = balance;
                balance = 0;
            }return value;

        } return 0;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                ", accountID=" + accountID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(iban, account.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Account account = (Account) o;
//        return accountID == account.accountID;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(accountID);
//    }


}
