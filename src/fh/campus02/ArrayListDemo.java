package fh.campus02;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Osterhase> mauritius = new ArrayList<>();
        Osterhase karl = new Osterhase("karl von Karlingen", 1000, HasenReligion.EXTRA_BUNTE_OSTEREIER);
        Osterhase karla = new Osterhase("karla Kolumna", 111, HasenReligion.ZUR_HEILIGEN_KAROTTE);
        Osterhase uschi = new Osterhase("Uschi", 777, HasenReligion.LANGE_OHREN_ZEUGEN);

        mauritius.add(karl);
        mauritius.add(karla);
        mauritius.add(uschi);
        // print the elements with a for loop
        for (int h=0; h<mauritius.size(); ++h){
            System.out.println(mauritius.get(h));
        }
        // print with for each loop
        for(Osterhase oh : mauritius){
            System.out.println(oh);
        }
         //index where the element is.
        System.out.println(mauritius.indexOf(karla));

        //use an iterator
        Iterator<Osterhase> iter = mauritius.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("**********************");

        //delete one element
        mauritius.remove(karla);
        // check if the element has been removed or not
        System.out.println(mauritius.contains(karla));



    }
}
