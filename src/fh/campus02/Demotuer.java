package fh.campus02;

public class Demotuer {
    public static void main(String[] args) {
        Tuer t1= new Tuer(1.5, 2.0, Himmelrichtung.OSTEN);
        System.out.println(t1.getRichtung());
        t1.setRichtung(Himmelrichtung.SUEDEN);
        System.out.println(t1);
    }



}
