package Bai9;

public class Main {
    public static void main(String[] args) {
        Frac frac = new Frac(18, 36);
        frac.simplify(frac);
        Frac frac1 = new Frac(1, 4);
        Frac frac2 = new Frac(2, 4);
        Frac frac3 = new Frac(1, 3);

        Frac addResult = frac1.add(frac2);
        System.out.println("Cộng 2 phân số cùng mẫu: " + frac1.getNumerator() + "/" + frac1.getDenominator() +
                " + " + frac2.getNumerator() + "/" + frac2.getDenominator() +
                " = " + addResult.getNumerator() + "/" + addResult.getDenominator());
        Frac addRessult2 = frac1.add(frac3);
        System.out.println("Cộng 2 phân số khác mẫu: " + frac1.getNumerator() + "/" + frac1.getDenominator() +
                " + " + frac3.getNumerator() + "/" + frac3.getDenominator() +
                " = " + addRessult2.getNumerator() + "/" + addRessult2.getDenominator());

        Frac subResult = frac1.sub(frac2);
        System.out.println("Trừ 2 phân số cùng mẫu: " + frac1.getNumerator() + "/" + frac1.getDenominator() +
                " - " + frac2.getNumerator() + "/" + frac2.getDenominator() +
                " = " + subResult.getNumerator() + "/" + subResult.getDenominator());
        Frac subRessult2 = frac1.sub(frac3);
        System.out.println("Trừ 2 phân số khác mẫu: " + frac1.getNumerator() + "/" + frac1.getDenominator() +
                " - " + frac3.getNumerator() + "/" + frac3.getDenominator() +
                " = " + subRessult2.getNumerator() + "/" + subRessult2.getDenominator());

        Frac mulResult = frac1.multiply(frac2);
        System.out.println("Nhân 2 phân số : " + frac1.getNumerator() + "/" + frac1.getDenominator() +
                " * " + frac2.getNumerator() + "/" + frac2.getDenominator() +
                " = " + mulResult.getNumerator() + "/" + mulResult.getDenominator());

        Frac divResult = frac1.divide(frac2);
        System.out.println("Chia 2 phân số : " + frac1.getNumerator() + "/" + frac1.getDenominator() +
                " / " + frac2.getNumerator() + "/" + frac2.getDenominator() +
                " = " + divResult.getNumerator() + "/" + divResult.getDenominator());
    }
}
