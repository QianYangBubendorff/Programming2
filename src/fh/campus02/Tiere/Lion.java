package fh.campus02.Tiere;

public class Lion extends Animal{
    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("The lion walks on padded paws.");
    }

    @Override
    public void makeNoise() {
        System.out.println("The lion roars.");
    }
}
