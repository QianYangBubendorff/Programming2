package fh.campus02.Instrumente;

public class Main {
    public static void main(String[] args) {
        Gitarre g = new Gitarre(10,"electric Gitarre");
        Trompete t = new Trompete(15,"the Trompete");
        Orchester o = new Orchester();

        o.addInstrument(g);
        o.addInstrument(t);



    }
}
