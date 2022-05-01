package fh.campus02.Konto;

public class Konto {
    protected String inhaber;
    protected double kontostand=0;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
    }

    public void einzahlen(double wert){
        kontostand=kontostand+wert;
    }

    public double auszahlen(double wert){
        kontostand=kontostand-wert;
        return wert;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }
}
