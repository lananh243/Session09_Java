package Bai3;

public class Rec {
    private double length;
    private double width;

    public Rec() {
        this.length = 1;
        this.width = 1;
    }

    public Rec(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(double length, double width) {
        return length  * width;
    }

    public double getPerimeter(double length, double width) {
        return (length + width) * 2;
    }

    public void displayData () {
        System.out.printf("Chiều dài HCN : %.2f\n", this.length);
        System.out.printf("Chiều rộng HCN : %.2f\n", this.width);
        System.out.printf("Diện tích HCN : %.2f\n", this.getArea(length, width));
        System.out.printf("Chu vi HCN : %.2f\n", this.getPerimeter(length, width));
    }
}
