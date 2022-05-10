package fh.campus02.InstrumentAbstract.Instrumente;

import java.util.ArrayList;

public class Orchester {
    private ArrayList<Instrument> list;

    public Orchester() {
        list = new ArrayList<>();
    }


    public void addInstrument(Instrument i){
        list.add(i);
    }

    public void playAll(){
        int sum=0;
        for(Instrument i: list){
            i.play();
            sum= sum+i.getLautstärke();

        }
        System.out.println("Sum of Lautstärke: "+ sum);
    }
}
