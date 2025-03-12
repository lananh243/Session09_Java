package Bai9;

public class Main {
    public static void main(String[] args) {
        Frac frac = new Frac(18, 36);
        frac.simplify(frac);
        Frac frac1 = new Frac(1, 4);
        Frac frac2 = new Frac(2, 4);
        Frac frac3 = new Frac(1, 3);

        System.out.println("Cộng 2 phân số cùng mẫu: " + frac1 + " + " + frac2 + " = " + frac1.add(frac2));
        System.out.println("Cộng 2 phân số khác mẫu: " + frac1 + " + " + frac3 + " = " + frac1.add(frac3));
        System.out.println("Trừ 2 phân số cùng mẫu: " + frac1 + " - " + frac2 + " = " + frac1.sub(frac2));
        System.out.println("Trừ 2 phân số khác mẫu: " + frac1 + " - " + frac3 + " = " + frac1.sub(frac3));
        System.out.println("Nhân 2 phân số: " + frac1 + " * " + frac2 + " = " + frac1.multiply(frac2));
        System.out.println("Chia 2 phân số: " + frac1 + " / " + frac2 + " = " + frac1.divide(frac2));
    }
}
