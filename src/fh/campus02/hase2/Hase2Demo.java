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


//         up and down casting explanation

        Osterhase o1 = new Osterhase("ozi");
        Hase h3 = new Hase("cutie");
        Weihnachtshase w= new Weihnachtshase("wini");

        Weihnachtshase wh;
        Osterhase oh;
        Hase h;

//        upcasting: assigning a child class to a parent class reference
        h = o1;// can only have access of the hase methods
        h.hoppeln();

//        down casting: assigning a general type to a more specialized type(this only works if this general reference already refers to a specialized object instance

//            w = (Weihnachtshase) h3;    // this gives us a classcastexception

//        There are special cases when the down casting works (I will have to upcast before- We know that behind this hase reference is really a Weinhnachtshase)
          h = w;
          wh = (Weihnachtshase) h;
          wh.hoppeln();







    }
}
