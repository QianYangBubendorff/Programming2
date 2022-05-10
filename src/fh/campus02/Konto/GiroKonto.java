package fh.campus02.Konto;

public class GiroKonto extends Konto{
    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if(wert<1000){
            kontostand=kontostand-wert;

    }else{
            kontostand=kontostand-1000;

        }return 1000;
    }
}
