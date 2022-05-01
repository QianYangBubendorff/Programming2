package fh.campus02.Konto;

public class JugendGiroKonto extends GiroKonto {
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {
        if (wert < buchungslimit) {
            super.einzahlen(wert);
        } else {
            super.einzahlen(buchungslimit);
        }
    }

    @Override
    public double auszahlen(double wert) {
        double buchung=0;
        if (wert < 1000 && wert < buchungslimit) {
            kontostand = kontostand - wert;
            buchung= wert;
        } else if (wert >= 1000 && wert < buchungslimit) {
            kontostand = kontostand - 1000;
            buchung= 1000;
        } else if (wert < 1000 && wert > buchungslimit) {
            kontostand = kontostand - buchungslimit;
            buchung= buchungslimit;
        }return  buchung;
    }
}
