package fh.campus02;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;

    public Account(String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
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
}
