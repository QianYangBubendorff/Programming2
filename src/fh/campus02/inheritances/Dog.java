package fh.campus02.inheritances;

public class Dog implements Comparable<Dog>{
    public  String name;
    public String eyeColor;
    public  int weight;
    public boolean appreciatesOtherDogs;

    public Dog(String name, String eyeColor, int weight, boolean appreciatesOtherDogs) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.appreciatesOtherDogs = appreciatesOtherDogs;
    }

//    public Dog(){
//        this.name = "Hund";
//        this.eyeColor = "black";
//        this.weight = 17;
//        this.appreciatesOtherDogs = true;
//    }

    public void bark(){
        System.out.println(name + " barks");
    }

    public void eat(){
        System.out.println(name + " eats");
        bark();
    }

    @Override

    public String toString() {
        String text = null;
        if(appreciatesOtherDogs){
            text = name + " admires other dogs with their sparkly " + eyeColor + " eyes";
        }else {
            text = name + " barks until all other dogs leave the party";
        }
        return text;
    }
//sort with 2 criteria: name and weight
    @Override
    public int compareTo(Dog o) {
        int ergFirst = this.name.compareTo(o.name);
        if (ergFirst != 0) {
            return ergFirst;
        }

        if (this.weight > o.weight) {
                return 1;
            }

        if (this.weight < o.weight) {
                return -1;
            }
            return 0;
        }
}
