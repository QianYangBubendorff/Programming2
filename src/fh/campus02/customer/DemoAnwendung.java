package fh.campus02.customer;

import java.util.ArrayList;

public class DemoAnwendung {
    public static void main(String[] args) {
        Customer c1= new Customer(1,"Jack", "Smith");
        Address a1= new Address("Moserhofgasse 1", "Graz","Graz","AT");
        c1.addAddress(a1);

        Customer c2 = new Customer(2,"Ana", "Maria");
        Address a2 = new Address("Jokoministrasse", "8010", "Graz", "AT");
        c2.addAddress(a2);

        System.out.println(a1);
        System.out.println(c1);
        System.out.println(c2);
        c1.doSomething();

    }

}
