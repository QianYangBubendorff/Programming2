package fh.campus02.maybeT;

import fh.campus02.bank.Account;

public class MaybeTest {
    public static void main(String[] args) {
        Maybe<Double> gehalt = new Maybe<>(2030.45, 2);
        gehalt.print();
        Maybe<Account> meinKonto = new Maybe<>(new Account("Laura", "AThhhh", "RAIKAHHH"),1);
        meinKonto.print();
    }
}
