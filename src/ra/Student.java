package ra;

import java.util.Scanner;

public class Student {
/*
* Xây dựng lớp Sinh viên quản lý thông tin sinh viên
* 1. Các thuộc tính
* - Mã sinh viên
* - Tên sinh viên
* - Giới tính sinh viên
* - Địa chỉ SV
* 2. Có 3 constructor: ko tham số mã SV - tên SV, có đầy đủ tham số
* 3. Có các hành vi
* - Tính tổng 2 số nguyên
* - Chào giảng viên
* - Nhập thông tin SV
* - Hiển thị thông tin SV*/

    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
// Contructor default : 0 tham số khởi tạo đối tượng với các thuộc tính với giá trị mặc đinh
    public Student() {
    }

//    Contructor 2 tham số khởi tạo đối tượng với mã sinh viên và tên SV
    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

//    Contructor đầy đủ tham số để khởi tạo tất cả các thông tin của SV

    public Student(String studentId, String studentName, int age, boolean sex, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
//    Methods mô tả hành vi của đối tượng
//    Syntax: Access Modifier + ReturnData + MethodName(Paramaters){Block Statements}
//    3.1 Getter/Setter
//    Getter: Lấy dữ liệu các thuộc tính
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//  3.2  Method Behavior
    public int addTwoNumber (int a, int b){
        int sum =  a+b;
        return sum;
    }

    public void helloTeacher () {
        System.out.println("Xin chào giảng viên");
    }

    public void inputData (Scanner scanner){
        System.out.println("Nhập vào mã sinh viên : ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên : ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi SV : ");
        this.age = scanner.nextInt();
        System.out.println("Nhập vào giới tính : ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ : ");
        this.address = scanner.nextLine();

    }

    public void showData(){
        System.out.printf("Mã SV : %s - Tên SV : %s - Tuổi : %d\n", this.studentId, this.studentName, this.age);

    }
}
