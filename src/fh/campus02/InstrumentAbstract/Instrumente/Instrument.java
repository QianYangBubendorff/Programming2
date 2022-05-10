package fh.campus02.InstrumentAbstract.Instrumente;

public abstract class Instrument {
    protected int lautstärke;
    protected String name;

    public Instrument(String n, int l) {
       name = n;
       lautstärke = l;
    }

    public abstract int play();

    public int getLautstärke() {
        return lautstärke;
    }

    public void setLautstärke(int lautstärke) {
        this.lautstärke = lautstärke;
    }
}
