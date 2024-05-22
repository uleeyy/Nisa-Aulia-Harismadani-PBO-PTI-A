package project_root.tugaspraktikum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inhere = new Scanner (System.in);

        System.out.println("==== KOPERASI NV. MENEER ====");
        System.out.println();
        System.out.print("Nama\t\t\t\t: ");
        String nama = inhere.nextLine();
        System.out.print("Nomor Registrasi\t: ");
        int noReg = inhere.nextInt();
        System.out.print("Gaji Per Bulan\t\t: ");
        int gaji = inhere.nextInt();
        System.out.println();
        System.out.print("Banyak Jenis Produk Yang Ingin Dibeli : ");
        int jProduk = inhere.nextInt();
        Employee em = new Employee (nama, noReg, gaji, jProduk );
        for (int i = 0; i < jProduk; i++) {
            System.out.print("Produk Ke-" + (i + 1) + " : ");
            String nProduk = inhere.next();
            System.out.print("Banyak Produk Yang Ingin Dibeli : ");
            int bProduk = inhere.nextInt();
            System.out.print("Harga Per Item : ");
            int hSatuan = inhere.nextInt();
            em.getInvoices() [i] = new Invoice(nProduk, bProduk, hSatuan);
        }
        em.output();


    System.out.println("===============================================");
        double beli = (em.getSalaryPerMonth() - em.getPayableAmount());
        System.out.println("Pembelian Produk Koperasi\t: " + beli);
        System.out.println("Gaji Setelah Dipotong\t\t: " + em.getPayableAmount());
    
    System.out.println("===============================================");      
    }
}