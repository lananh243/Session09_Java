package Bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    public enum Gender {
        MALE, FEMALE, OTHER;
    }

    private int id;
    private String name;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Student() {
    }
    public Student(int id, String name, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void inputData (Scanner scanner) {
        System.out.println("Nhập mã SV : ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên SV : ");
        this.name = scanner.nextLine();
        System.out.println("Nhập giới tính SV : ");
        this.gender = Gender.valueOf(scanner.nextLine());
        System.out.println("Nhập địa chỉ : ");
        this.address = scanner.nextLine();
        System.out.println("Nhập số điện thoại : ");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã SV : "+this.id);
        System.out.println("Tên SV : "+this.name);
        System.out.println("Giới tính : "+this.gender);
        System.out.println("Địa chỉ : "+this.address);
        System.out.println("Số điện thoại : "+this.phoneNumber);
    }

    private static List<Student> studentList = new ArrayList<>();

    public static void addStudent(Scanner scanner) {
        Student student = new Student();
        student.inputData(scanner);
        studentList.add(student);
    }

    public int getId() {
        return id;
    }

    public static void updateStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Student student : studentList) {
            if (student.getId() == id) {
                student.inputData(scanner);
                return;
            }
        }
    }

    public static void deleteStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                return;
            }
        }
    }

    public static void displayAllStudents() {
        for (Student student : studentList) {
            student.displayData();
            System.out.println("-----------------------");
        }
    }

}
