package Bai8;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tài khoản : ");
        String accountNumber = scanner.nextLine();
        System.out.println("Nhập tên chủ tài khoản : ");
        String accountHolder = scanner.nextLine();
        System.out.println("Nhập số dư tài khoản : ");
        Double balance = Double.parseDouble(scanner.nextLine());

        BankAcc bankAcc1 = new BankAcc(accountNumber, accountHolder, balance);

        System.out.println("Nhập số tài khoản 2 : ");
        String accountNumber2 = scanner.nextLine();
        System.out.println("Nhập tên chủ tài khoản 2 : ");
        String accountHolder2 = scanner.nextLine();
        System.out.println("Nhập số dư tài khoản 2 : ");
        Double balance2 = Double.parseDouble(scanner.nextLine());

        BankAcc bankAcc2 = new BankAcc(accountNumber2, accountHolder2, balance2);
        System.out.println("Nhập số tiền : ");
        Double amount = Double.parseDouble(scanner.nextLine());

        bankAcc1.deposit(amount);
        bankAcc1.withdraw(amount);
        bankAcc1.transfer(bankAcc2, amount);

        bankAcc1.displayData();
        bankAcc2.displayData();
    }
}
