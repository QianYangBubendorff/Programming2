package fh.campus02;

import fh.campus02.inheritances.Beagle;

public class SameNotSame {
    public static void main(String[] args) {
//        we want to find out which class an object is
//        There are two ways
//        if possible do not use them at all-use polymorhism, base class
//        with the same methods

//        situation 1, check if obj of a class is exactly this class
//        maybe less useful than the other one
        Beagle b = new Beagle("Doggo","Dogy","black",50,false );
//        here it is less fun because we really know what is on it
        System.out.println(b.getClass());
        System.out.println(Beagle.class);

        if(b.getClass().equals(Beagle.class)){
            System.out.println("The same");
        }

        Object obj = b;
        System.out.println(obj.getClass());
        if(obj.getClass().equals(Beagle.class)){
//            confirm if same class, then we can down cast
            Beagle b2 = (Beagle) obj;
//            now we can use the Beagle methods
        }

//        situation2: var instanceof Classname
//        here we are not interested in the exact type but if it is able to do all necessary stuff(this means i am the correct class, or a subclass, or an interface implementing class.
        if(b instanceof  Beagle){
            System.out.println("yep");
        }
//        now we can get check all kind of subclasses of animals and save them as an animal reference and execute animal methods


    }
}
