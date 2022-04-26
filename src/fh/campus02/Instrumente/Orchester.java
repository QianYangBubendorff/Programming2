package fh.campus02.Instrumente;

import java.util.ArrayList;

public class Orchester {
    private ArrayList<Instrument> list;

    public Orchester() {
        list = new ArrayList<>();
    }

    public void playAll(){
        int sum=0;
        for(Instrument i: list){
            i.play();
            sum= sum+i.lautstärke;
        }
        System.out.println("Sum of Lautstärke: "+ sum);
    }
}
