package Bai3;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        System.out.println("Chiều dài và chiều rộng HCN mặc định ");
        Rec reactangle  = new Rec();
        reactangle.displayData();
        System.out.println("Chiều dài và chiều rộng HCN có tham số ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật : ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chiều rộng hình chữ nhật : ");
        double width = Double.parseDouble(scanner.nextLine());
        Rec rectangle = new Rec(length, width);

        rectangle.displayData();
    }
}
