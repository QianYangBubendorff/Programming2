package fh.campus02.fraction;

public class Fraction {
    private static int fractionCount = 0;
    private int numerator;
    private int denominator;
//    constructor for Fraction class
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        ++fractionCount;
    }

    public static int getFractionCount() {
        return fractionCount;
    }

    @Override
    public String toString() {
        return  numerator + " /"+ denominator;
    }

    //    getter for Fraction class
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    public double toDecimal(){
        return (double)numerator/denominator;
    }

    public void print(){
        System.out.println(numerator + " / "+denominator);
    }

    public Fraction multiplicate(Fraction b2){
        Fraction fraction1=new Fraction(numerator,denominator);
        fraction1.numerator = fraction1.numerator * b2.numerator;
        fraction1.denominator = fraction1.denominator * b2.denominator;
        return fraction1;
    }

    public Fraction multiplicate(Fraction b2, Fraction b3){
        Fraction fraction1=new Fraction(numerator,denominator);
        fraction1.numerator=b2.numerator * b3.numerator * fraction1.numerator;
        fraction1.denominator=b2.denominator * b3.denominator * fraction1.denominator;
        return fraction1;
    }

    public Fraction add(Fraction b2){
        Fraction fraction1=new Fraction(numerator,denominator);
        fraction1.numerator = fraction1.numerator * b2.denominator+b2.numerator * fraction1.denominator;
        fraction1.denominator = fraction1.denominator * b2.denominator;
        return fraction1;
    }

}
