package fh.campus02;

public class Osterhase {
    private String name;
    private int anzahlVersteckteEier;

    public Osterhase(String name, int anzahlVersteckteEier){
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;
    }

    public Osterhase(String name){
        this.name = name;
        this.anzahlVersteckteEier = 0;
    }
    public String getName() {
        return name;
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
