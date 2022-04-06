package fh.campus02.Hase;

public class Osterhase {
    private static int haeschenZaehler = 1;
    private String name;
    private int anzahlVersteckteEier;
    private int haeschenNummer;
    private HasenReligion peronenlicherGlaube;

    public Osterhase(String name, int anzahlVersteckteEier, HasenReligion glaube){
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;
        haeschenNummer = haeschenZaehler ++;//jeder osterhase soll ein eigene eindeutige nummer haben
        //alternativer zugriff oder von außen (wenn nicht privat wäre)
        //Osterhase.haeschenZaeler
        peronenlicherGlaube = glaube;
    }

    public Osterhase(String name){
        this.name = name;
        this.anzahlVersteckteEier = 0;
        haeschenNummer = haeschenZaehler ++;
        peronenlicherGlaube = HasenReligion.LANGE_OHREN_ZEUGEN;
    }

    public String getName() {
        return name;
    }

    public int getHaeschenNummer() {
        return haeschenNummer;
    }

    @Override
    public String toString() {
        return  name + " vesteckte " + anzahlVersteckteEier +
                "  Eier und glaub an: "+ peronenlicherGlaube;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public void aendereAnzahlEier(int anzahlVersteckteEier) {
//        //local variable/parameter
//        //       use this reference refers to the actual instance.
//        if (anzahlVersteckteEier >= 0) {
//            this.anzahlVersteckteEier = anzahlVersteckteEier;
//        }
//    }
//
//    //        method overloading, same method name but with different parameters
//    public void aendereAnzahlEier() {
//        anzahlVersteckteEier = 12;
//    }

//    public int gibMirAnzahlDerVerstecktenEier() {
//        return anzahlVersteckteEier;
//    }
// automatically generate the getter and setter (code-generate-getter and setter-select the attribute-ok)
    public int getAnzahlVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if (anzahlVersteckteEier >= 0) {
            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }
}
