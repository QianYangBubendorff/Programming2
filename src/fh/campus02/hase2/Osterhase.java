package fh.campus02.hase2;

public class Osterhase extends Hase{

    public Osterhase(String name) {
        super(name);
    }

    public void versteckeOstereier(){
        System.out.println(name+ " hides the easter eggs");
    }

    @Override
    public void hoppeln() {
        System.out.println(name + "hoppelt im Wald und sucht die Eier");
    }
}
