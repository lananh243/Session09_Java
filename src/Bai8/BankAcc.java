package Bai8;

public class BankAcc {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAcc(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp tiền thành công. Số dư mới: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rút tiền thành công. Số dư mới: " + balance);
        }else {
            System.out.println("Số dư ko đủ");
        }
    }

    public void transfer(BankAcc recipient, double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            recipient.balance += amount;

            System.out.println("Chuyển tiền thành công. Số dư mới của " + accountHolder + " là: " + balance);
        }else {
            System.out.println("Số dư của tài khoản ko đủ");
        }
    }

    public void displayData() {
        System.out.println("Số tài khoản : "+ accountNumber);
        System.out.println("Tên chủ tài khoản : "+ accountHolder);
        System.out.println("Số dư : "+ balance);
    }
}
