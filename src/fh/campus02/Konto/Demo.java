package fh.campus02.Konto;

public class Demo {
    public static void main(String[] args) {
        JugendGiroKonto j=new JugendGiroKonto("Jack", 1000.0,500.0);
        Konto k=(Konto) j;
        k.einzahlen(1000);
        System.out.println(k.kontostand);
        k.auszahlen(600);
        System.out.println(k.kontostand);

        GiroKonto g=(GiroKonto) k;
        g.einzahlen(600);
        System.out.println(g.kontostand);
        g.auszahlen(600);
        System.out.println(g.kontostand);
    }
}
