package fh.campus02.hase2;

import java.util.ArrayList;

public class Hasenstall {
    public ArrayList<Hase> list;

    public Hasenstall() {
        list = new ArrayList<>();
    }

    public void add(Hase h){
        list.add(h);
    }

    public void hoppeln(){
        for(Hase h: list){
           h.hoppeln();
        }
    }
}
