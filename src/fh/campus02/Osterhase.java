package fh.campus02;

public class Osterhase {


        public int anzahlVersteckteEier;

        public void aendereAnzahlEier(int anzahlVersteckteEier){
            //local variable/parameter
    //       use this reference refers to the actual instance.
            this.anzahlVersteckteEier = anzahlVersteckteEier;

        }
//        method overloading, same method name but with different parameters
        public void aendereAnzahlEier(){
            anzahlVersteckteEier = 12;
        }
}
