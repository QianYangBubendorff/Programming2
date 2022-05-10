package fh.campus02.Tiere;

public class Animalapp {
    public static void main(String[] args) {
        Frog quaxi=new Frog("green",2);
        Animal quaxiAsAnimal=(Animal)quaxi;
        Frog quaxiRetransformed=(Frog)quaxiAsAnimal;

        Cat Thais= new Cat("white", 2);

        Nature n1= new Nature();
        n1.addAnimal(quaxi);
        n1.addAnimal(Thais);

        System.out.println(n1.countColor("white"));
    }
}
