package fh.campus02.Konto;

public class SparKonto extends Konto {
    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        double buchung=0;
     if(wert>kontostand){
         kontostand=0;
         buchung=kontostand;
     }else{
         kontostand=kontostand-wert;
         buchung=wert;
     }return buchung;
    }
}
