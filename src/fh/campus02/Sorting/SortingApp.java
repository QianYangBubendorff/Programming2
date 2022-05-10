package fh.campus02.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        int [] intArr = {27, -12, 4, 29, 34};
        String [] strArr = {"Hansis Erste Hits", "Hansis Beste", "Hansis Neuestes Album"};
        Mitarbeiter [] m1= {new Mitarbeiter("Hansi", "Hinterseer", 1954),
                            new Mitarbeiter("Sonja", "Sonnenblume", 1970),
                            new Mitarbeiter("Helena", "Fischer",1980)};
        List<Mitarbeiter> mrList = new ArrayList<>(Arrays.asList(m1));
        System.out.println(mrList);

        Collections.sort(mrList,new ZunameComparator());
        System.out.println(mrList);
        System.out.println("*************");

//   sort int array
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

//        sort String array, case sensitive
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

//        sort Object array
        System.out.println(Arrays.toString(m1));
        Arrays.sort(m1);
        System.out.println(Arrays.toString(m1));


    }
}
