package fh.campus02.Land;

public class Demo {
    public static void main(String[] args) {
        Bundesstaat b= new Bundesstaat();
        Bundesland b1=new Bundesland(200000.0);
        Bundesland b2=new Bundesland(300000.0);
        b.addLand(b1);
        b.addLand(b2);
        System.out.println(b.getBruttoSozialProdukt());

    }
}
