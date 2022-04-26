package fh.campus02.Instrumente;

public class Instrument {
    public int lautstärke;

    public Instrument(int lautstärke) {
        this.lautstärke = lautstärke;
    }

    public int play(){
        return lautstärke;

    }
}
