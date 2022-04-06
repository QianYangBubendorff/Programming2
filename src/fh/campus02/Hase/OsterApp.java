package fh.campus02.Hase;

public class OsterApp {
    public static void main(String[] args) {
        Osterhase dieter= new Osterhase("Dieter(formerly known as Hansi)", 5, HasenReligion.ZUR_HEILIGEN_KAROTTE);
        Osterhase marla = new Osterhase("Marla");
//        dieter.setName("Dieter(formerly known as Hansi)");
//        dieter.setAnzahlVersteckteEier(5);
        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());
        System.out.println(dieter.getHaeschenNummer());

        System.out.println(marla.getName());
        System.out.println(marla.getAnzahlVersteckteEier());
        System.out.println(marla.getHaeschenNummer());

        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier()+1);
        System.out.println(dieter.getAnzahlVersteckteEier());
//        System.out.println(dieter.anzahlVersteckteEier);

//        System.out.println(dieter.anzahlVersteckteEier);


//        dieter.anzahlVersteckteEier = -2;
//        System.out.println(dieter.anzahlVersteckteEier);
        System.out.println(dieter);
    }
}
