package fh.campus02.inheritances;

public class Beagle extends Dog {
    public String lovedFood;

    public Beagle(String lovedFood,String name, String eyeColor, int weight, boolean appreciatesOtherDogs){
//        dog() constructor default value will be taken
//        super();//will be called automatically
//        when there is no default constructor at the super class, we have to explicitly call the super constructor
        super(name, eyeColor,weight,appreciatesOtherDogs);
        this.lovedFood = lovedFood;

    }
//override the method of the super class
    @Override
    public void bark() {
        super.bark();// here with super. because there is an override, otherwise will become recursive bark()
//        eat();to call other methods from super class
    }
}
