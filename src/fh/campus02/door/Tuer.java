package fh.campus02.door;

import fh.campus02.Hase.Himmelrichtung;

public class Tuer {
    private double breite;
    private double höhe;
    private Himmelrichtung richtung;

    public Tuer(double breite, double höhe, Himmelrichtung richtung){
        this.breite = breite;
        this.höhe = höhe;
        this.richtung = richtung;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHöhe() {
        return höhe;
    }

    public void setHöhe(double höhe) {
        this.höhe = höhe;
    }

    public Himmelrichtung getRichtung() {
        return richtung;
    }

    public void setRichtung(Himmelrichtung richtung) {
        this.richtung = richtung;
    }

    @Override
    public String toString() {
        return "Tuer{" +
                "breite=" + breite +
                ", höhe=" + höhe +
                ", richtung=" + richtung +
                '}';
    }
}
