package fh.campus02.Tiere;

public class Frog extends Animal{

    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("The frog is jumping");
    }

    @Override
    public void makeNoise() {
        System.out.println("The frog quacks");
    }
}
