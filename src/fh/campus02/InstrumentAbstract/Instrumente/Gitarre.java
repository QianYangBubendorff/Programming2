package fh.campus02.InstrumentAbstract.Instrumente;

public class Gitarre extends Instrument {

    public Gitarre(String n, int l) {
        super(n, l);
    }

    @Override
    public int play() {
        System.out.println("Gitarre" +name+ "wird spielen" );
        return lautstärke;
    }
}
