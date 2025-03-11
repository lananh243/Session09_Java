package Bai5;

public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Vector add(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y);
    }

    public Vector sub(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y);
    }

    public double dotProduct(Vector v) {
        return x * v.x + y * v.y;
    }

    public void displayData() {
        System.out.printf("(%.2f, %.2f)\n", this.x, this.y);
        System.out.printf("Độ dài giữa 2 vector : %.2f\n", this.calculateMagnitude());
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
