package fh.campus02.Instrumente;

public class Instrument {
    protected int lautstärke;

    public Instrument(int lautstärke) {
        this.lautstärke = lautstärke;
    }

    public int play(){
        return lautstärke;

    }

    public int getLautstärke() {
        return lautstärke;
    }

    public void setLautstärke(int lautstärke) {
        this.lautstärke = lautstärke;
    }
}
