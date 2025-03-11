package Bai5;

import java.util.Scanner;

public class Vector2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tọa độ x = ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tọa độ y = ");
        double y = Double.parseDouble(scanner.nextLine());
        Vector vector = new Vector(x,y);
        vector.displayData();

        System.out.print("Nhập tọa độ x1 = ");
        double x1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tọa độ y1 = ");
        double y1 = Double.parseDouble(scanner.nextLine());
        Vector vector2 = new Vector(x1, y1);
        vector2.displayData();

        System.out.println("Tổng giữa 2 vector : "+vector2.add(vector));
        System.out.println("Hiệu giữa 2 vector : "+vector2.sub(vector));
        System.out.println("Tích vô hướng giữa 2 vector : "+vector2.dotProduct(vector));
    }
}
