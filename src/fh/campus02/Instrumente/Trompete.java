package fh.campus02.Instrumente;

public class Trompete extends Instrument{
    private String name;


    public Trompete(int lautstärke, String name) {
        super(lautstärke);
        this.name = name;

    }


    @Override
    public int play() {
        System.out.println("Trompete "+name+ "wird spielen");
        return lautstärke;
    }
}
