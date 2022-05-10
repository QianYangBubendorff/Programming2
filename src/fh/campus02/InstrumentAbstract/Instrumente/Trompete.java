package fh.campus02.InstrumentAbstract.Instrumente;

public class Trompete extends Instrument {
    public Trompete(String n, int l) {
        super(n, l);
    }

    @Override
    public int play() {
        System.out.println("Trompete "+name+ "wird spielen");
        return lautstärke;
    }
}
