package fh.campus02.Tiere;

public class Cat extends Animal{
    public Cat(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("The cat walks gracefully.");
    }

    @Override
    public void makeNoise() {
        System.out.println("The cat meows");
    }
}
