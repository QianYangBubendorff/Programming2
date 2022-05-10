package fh.campus02.logisticManager;

public class Car implements Moveable{
    private String type;
    private String color;
    private double weight;

    public Car(String type, String color, double weight) {
        this.color = color;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public void move(String destination) {
        System.out.println(color+" "+type+" "+"will be moved to "+destination+".");
    }
}
