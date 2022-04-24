package fh.campus02.hash;

import fh.campus02.bank.Account;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.HashMap;

public class Hashproblem {
    public static void main(String[] args) {
        String s1 = "VII";
        String s2 = "Ugh";
//test if the Iban the same
        Account a1 = new Account("Mike","AT12345678","RZ619T4356");
        Account a2 = new Account("Jack","AT12345678", "RYT7899T2");
//each object can only exist once in the hashset. With the hashashcode() and equals() method, we can judge if it already exists.
        HashSet<Account> bank = new HashSet<Account>();
        System.out.println(bank.add(a1));
        System.out.println(bank.add(a2));


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        HashMap<String,Integer> map1=new HashMap<>();
        System.out.println(map1.put("Graz",1));
        System.out.println(map1.put("Graz",0));
        System.out.println(map1.put("Graz",0));
    }

}
