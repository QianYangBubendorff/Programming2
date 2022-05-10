package fh.campus02.inheritances;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog("ScoobyDoo","black",40,true);
        Dog hudi = new Dog("Hudi","black",30,true);
        Beagle b = new Beagle("cookie","Bily","black",25,true);
        Dog snoopy = new Dog("Snoopy", "white", 38, false);
        System.out.println(scooby);
        scooby.bark();

        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(scooby);
        dogList.add(hudi);
        dogList.add(b);
        dogList.add(snoopy);
        Collections.sort(dogList);
        System.out.println("**************");
        System.out.println(dogList);

//        Dog hund = new Dog();
//        hund.bark();

        Beagle hansi = new Beagle("everything","Hansi","blue", 80,false);
        System.out.println(hansi);
        hansi.bark();


    }
}
