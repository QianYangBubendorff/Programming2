package fh.campus02.fraction;

public class DemoFraction {
    public static void main(String[] args) {
        Fraction fraction= new Fraction(3,4);
        Fraction b2= new Fraction(4,5);
        Fraction multi= fraction.multiplicate(b2);
        multi.print();
        Fraction b3=new Fraction(5,6);
        Fraction multi1=fraction.multiplicate(b2,b3);
        multi1.print();
      Fraction add= fraction.add(b2);
      add.print();
        System.out.println(b2);
        System.out.println(Fraction.getFractionCount());

    }
}
