package fh.campus02.Tiere;

public class Animal {
    private String color;
    private int countEyes;

    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }

    public String getColor() {
        return color;
    }

    public void walk(){
        System.out.println("This animal walks like this");
    }

    public void makeNoise(){
        System.out.println("This animal makes this sound");
    }
}
