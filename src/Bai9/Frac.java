package Bai9;

public class Frac {
    private int numerator;
    private int denominator;


    public Frac(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Frac add(Frac other) {
        if (denominator == other.denominator) {
            return new Frac(this.numerator + other.numerator,  this.denominator);
        }else {
            int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
            int newDenominator = this.denominator * other.denominator;
            return new Frac(newNumerator, newDenominator);
        }
    }

    public Frac sub(Frac other) {
        if (denominator == other.denominator) {
            return new Frac(this.numerator - other.numerator, this.denominator);
        }else {
            int newNumerator = this.numerator * other.denominator - this.denominator * other.numerator;
            int newDenominator = this.denominator * other.denominator;
            return new Frac(newNumerator, newDenominator);
        }
    }

    public Frac multiply(Frac other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Frac(newNumerator, newDenominator);
    }

    public Frac divide(Frac other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Frac(newNumerator, newDenominator);
    }

    public void simplify(Frac other) {
        int a = denominator;
        int b = numerator;
        int temp = 0;
        while (b != 0) {
            temp = a;
            a = b;
            b = temp % a;
        }

        System.out.println("Phân số sau khi rút gọn : "+numerator/a+"/"+denominator/a);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
