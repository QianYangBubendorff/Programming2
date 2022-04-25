package fh.campus02.hase2;

import java.util.ArrayList;

public class Hase2Demo {
    public static void main(String[] args) {
        Hase bunny = new Hase("Bunny");
        bunny.hoppeln();

        Hase izy = new Weihnachtshase("Izy");
        izy.hoppeln();

        Weihnachtshase h1 = (Weihnachtshase) izy;
         h1.verteileGeschenke();

         Osterhase h2 = new Osterhase("h2");
         h2.hoppeln();
        System.out.println("****************");
         Hasenstall s = new Hasenstall();
         s.add(bunny);
         s.add(h1);
         s.add(h2);
         s.hoppeln();

    }
}
