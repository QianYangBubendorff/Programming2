package fh.campus02.inheritances;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog("ScoobyDoo","black",40,true);
        System.out.println(scooby);
        scooby.bark();

//        Dog hund = new Dog();
//        hund.bark();

        Beagle hansi = new Beagle("everything","Hansi","blue", 80,false);
        System.out.println(hansi);
        hansi.bark();


    }
}
