package fh.campus02.Land;

import java.util.ArrayList;

public class Bundesstaat extends Land{
    private ArrayList<Land> laender;

    public Bundesstaat() {
       laender = new ArrayList<>();
    }

    public void addLand(Land l){
        laender.add(l);
    }
    @Override
    public double getBruttoSozialProdukt() {
        double sum=0;
        for(Land l: laender){
            sum=sum+l.getBruttoSozialProdukt();
        }
        return sum;
    }



}
