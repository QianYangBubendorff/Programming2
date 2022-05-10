package fh.campus02.Tiere;

import java.util.ArrayList;

public class Nature {
    private ArrayList<Animal> animalList;

    public Nature() {
        animalList = new ArrayList<>();
    }

    public void addAnimal(Animal a){
        animalList.add(a);
    }

    public int countColor(String color){
        int count=0;
        for(Animal a: animalList){
            if(a.getColor().equals(color)){
                count++;
            }
        }return count;
    }

}
