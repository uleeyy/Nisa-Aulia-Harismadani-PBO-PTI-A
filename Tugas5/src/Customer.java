import java.util.Scanner;
class Customer {
    private String accountNumber;
    private String name;
    private double balance;
    private int pin;
    private int loginAttempts;

    public Customer(String accountNumber, String name, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.loginAttempts = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean verifyPin(int enteredPin) {
        if (this.pin == enteredPin) {
            loginAttempts = 0; 
            return true;
        } else {
            loginAttempts++;
            if (loginAttempts >= 3) {
                System.out.println("Akun Anda telah diblokir karena 3x kesalahan dalam autentifikasi.");
                return false;
            }
            System.out.println("PIN yang Anda masukkan salah. Coba lagi.");
            return false;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah top up tidak valid.");
        } else {
            balance += amount;
            System.out.println("Top up berhasil. Saldo baru: Rp" + balance);
        }
    }

    public void purchase(double amount) {
        double cashback = 0;

        if (amount <= 0) {
            System.out.println("Jumlah pembelian tidak valid.");
            return;
        }

        if (amount > balance) {
            System.out.println("Saldo tidak mencukupi untuk melakukan pembelian.");
            return;
        }

        if (amount > 1000000) {
            if (accountNumber.startsWith("38")) {
                cashback = amount * 0.05;
            } else if (accountNumber.startsWith("56")) {
                cashback = amount * 0.07;
            } else if (accountNumber.startsWith("74")) {
                cashback = amount * 0.10;
            }
        } else {
            if (accountNumber.startsWith("56")) {
                cashback = amount * 0.02;
            } else if (accountNumber.startsWith("74")) {
                cashback = amount * 0.05;
            }
        }

        balance -= amount;
        balance += cashback;

        System.out.println("Pembelian berhasil. Saldo baru: Rp" + balance);
    }
}

class SupermarketTransaction {
    public static void main(String[] args) {
        Customer customer1 = new Customer("5678910112", "Ulee", 100000, 1234);

        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        int attempts = 0;
        while (!loggedIn && attempts < 3) {
            System.out.print("Masukkan nomor pelanggan: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Masukkan PIN: ");
            int enteredPin = scanner.nextInt();
            scanner.nextLine(); 

            if (customer1.getAccountNumber().equals(accountNumber) && customer1.verifyPin(enteredPin)) {
                loggedIn = true;
                System.out.println("Selamat datang, " + customer1.getName() + "!");
            } else {
                attempts++;
            }
        }

        if (loggedIn) {
            System.out.println("Silakan pilih transaksi:");
            System.out.println("1. Top Up");
            System.out.println("2. Pembelian");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah top up: ");
                    double topUpAmount = scanner.nextDouble();
                    customer1.topUp(topUpAmount);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah pembelian: ");
                    double purchaseAmount = scanner.nextDouble();
                    customer1.purchase(purchaseAmount);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}