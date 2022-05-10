package fh.campus02.logisticManager;

public class demo {
    public static void main(String[] args) {
        Car c=new Car("VW","red",20.0);
        Shirt s= new Shirt("Amani", 40);

        LogisticManager l= new LogisticManager();
        l.add(c);
        l.add(s);

        l.moveAll("graz");


    }
}
