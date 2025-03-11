package Bai4;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        System.out.println("Bán kính hình tròn mặc định ");
        Circle circle = new Circle();
        circle.displayData();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bán kính hình tròn có tham số ");
        System.out.print("Nhập bán kính hình tròn : ");
        double radius = Double.parseDouble(scanner.nextLine());
        Circle circle2 = new Circle(radius);
        circle2.displayData();
    }
}
