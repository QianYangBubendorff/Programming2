package fh.campus02.logisticManager;

public class Shirt implements Moveable {
    private String brand;
    int size;

    public Shirt(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public void move(String destination) {
        System.out.println(brand+" "+"size "+size+" Shirt "+"will be moved to "+destination+".");
    }
}
