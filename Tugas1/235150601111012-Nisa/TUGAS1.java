import java.util.ArrayList;
import java.util.Scanner;
public class Tugas1 {
    public static String nama;
    public static double saldo;
    public static ArrayList<String> transaksi;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        nama = scanner.nextLine();
        saldo = 1000000;
        transaksi = new ArrayList<String>();

        jalankanAplikasi(scanner);

        scanner.close();
    }

    public static void jalankanAplikasi(Scanner scanner) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Transfer Uang");
            System.out.println("3. Histori Transaksi");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    transfer(scanner);
                    break;
                case 3:
                    historiTransaksi();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan Tabungan.");
                    return;
                default:
                    System.out.println("Menu tidak valid. Silahkan pilih lagi.");
            }
        }
    }

    public static void cekSaldo() {
        System.out.println("Saldo saat ini: Rp " + saldo);
    }

    public static void transfer(Scanner scanner) {
        System.out.print("Masukkan nama penerima: ");
        scanner.nextLine();
        String penerima = scanner.nextLine();
        System.out.print("Masukkan jumlah transfer: ");
        double jumlah = scanner.nextDouble();
        if (saldo >= jumlah) {
            saldo -= jumlah;
            transaksi.add("Transfer ke " + penerima + ": Rp " + jumlah);
            System.out.println("Transfer berhasil.");
        } else {
            System.out.println("Saldo tidak mencukupi untuk transfer.");
        }
    }

    public static void historiTransaksi() {
        System.out.println("Histori Transaksi:");
        if (transaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (String transaksi : transaksi) {
                System.out.println(transaksi);
            }
        }
    }
}
