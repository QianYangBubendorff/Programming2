package fh.campus02.hase2;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteileGeschenke(){
        System.out.println(name + " shares the gifts");
    }

    @Override
    public void hoppeln() {
        System.out.println(name + " hops in the snow and brings us the gifts");
    }
}
