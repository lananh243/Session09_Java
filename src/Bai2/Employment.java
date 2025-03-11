package Bai2;

import java.util.Scanner;

public class Employment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã NV : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên NV : ");
        String name = scanner.nextLine();
        System.out.println("Nhập phòng ban : ");
        String department = scanner.nextLine();
        System.out.println("Nhập lương : ");
        int salary  = Integer.parseInt(scanner.nextLine());

        Emp emp = new Emp(id, name, department, salary);
        emp.displayInfo();
        System.out.println("Nhập phần trăm lương : ");
        double percentage = Double.parseDouble(scanner.nextLine());
        emp.increaseSalary(percentage);
    }
}
