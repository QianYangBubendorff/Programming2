package fh.campus02.Instrumente;

public class Gitarre extends Instrument{
    private String name;
    private String spielweise;

    public Gitarre(int lautstärke, String name,String spielweise) {
        super(lautstärke);
        this.name = name;
        this.spielweise = spielweise;
    }



    @Override
    public int play() {
        System.out.println(name+ "wird" + spielweise);
        return lautstärke;
    }
}
