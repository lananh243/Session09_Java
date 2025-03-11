package Bai4;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayData () {
        System.out.printf("Bán kính của hình tròn : %.2f\n", this.radius);
        System.out.printf("Diện tích của hình tròn : %.2f\n", this.getArea());
        System.out.printf("Chu vi của hình tròn : %.2f\n", this.getCircumference());
    }
}