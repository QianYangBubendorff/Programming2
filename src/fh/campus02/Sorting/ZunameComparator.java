package fh.campus02.Sorting;

import java.util.Comparator;

public class ZunameComparator implements Comparator<Mitarbeiter> {

    @Override
    public int compare(Mitarbeiter o1, Mitarbeiter o2) {
        return o1.getZname().compareTo(o2.getZname());
    }

}
