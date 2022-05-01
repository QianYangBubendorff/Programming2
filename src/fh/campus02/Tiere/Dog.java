package fh.campus02.Tiere;

public class Dog extends Animal{
    public Dog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("The dog runs");
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog barks");
    }
}
