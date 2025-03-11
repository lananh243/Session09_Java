package Bai10;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("******************MENU********************");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên dựa vào mã sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.println("Lựa chọn (1 - 5) : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sinh viên : ");
                    Student.displayAllStudents();
                    break;
                case 2:
                    Student.addStudent(scanner);
                    break;
                case 3:
                    Student.updateStudent(scanner);
                    break;
                case 4:
                    Student.deleteStudent(scanner);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn 1 - 5");
            }
        }while (true);
    }
}
