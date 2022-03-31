package fh.campus02;

public class OsterApp {
    public static void main(String[] args) {
        Osterhase dieter= new Osterhase();
        dieter.aendereAnzahlEier(5);
        System.out.println(dieter.anzahlVersteckteEier);
        dieter.aendereAnzahlEier();
        System.out.println(dieter.anzahlVersteckteEier);
    }
}
