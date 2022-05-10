package fh.campus02.Instrumente;

public class Gitarre extends Instrument{
    private String name;


    public Gitarre(int lautstärke, String name) {
        super(lautstärke);
        this.name = name;

    }



    @Override
    public int play() {
        System.out.println("Gitarre" +name+ "wird spielen" );
        return lautstärke;
    }
}
