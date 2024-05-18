import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];

        Random rand = new Random();
        for (int i = 0; i < kueArray.length; i++) {
            if (rand.nextBoolean()) {
                // KuePesanan
                double berat = rand.nextDouble() * 10 + 1;
                kueArray[i] = new KuePesanan("Kue Pesanan " + i, rand.nextDouble() * 100 + 1, berat);
            } else {
                // KueJadi
                double jumlah = rand.nextInt(10) + 1;
                kueArray[i] = new KueJadi("Kue Jadi " + i, rand.nextDouble() * 100 + 1, jumlah);
            }
        }

        System.out.println("Semua kue:");
        for (Kue kue : kueArray) {
            System.out.println(kue.toString());
        }

        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("\nTotal harga dari semua jenis kue: " + totalHarga);
        
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        int pesananCount = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).getBerat();
                pesananCount++;
            }
        }
        System.out.println("\nTotal harga dan total berat dari KuePesanan:");
        System.out.println("Total harga: " + totalHargaPesanan);
        System.out.println("Total berat: " + totalBerat);
        System.out.println("Jumlah KuePesanan: " + pesananCount);

        // Calculate total harga and total jumlah from KueJadi
        double totalHargaJadi = 0;
        double totalJumlah = 0;
        int jadiCount = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).getJumlah();
                jadiCount++;
            }
        }
        System.out.println("\nTotal harga dan total jumlah dari KueJadi:");
        System.out.println("Total harga: " + totalHargaJadi);
        System.out.println("Total jumlah: " + totalJumlah);
        System.out.println("Jumlah KueJadi: " + jadiCount);

        // Find kue with the highest harga
        Kue maxHargaKue = kueArray[0];
        for (int i = 1; i < kueArray.length; i++) {
            if (kueArray[i].hitungHarga() > maxHargaKue.hitungHarga()) {
                maxHargaKue = kueArray[i];
            }
        }
        System.out.println("\nKue dengan harga terbesar:");
        System.out.println(maxHargaKue.toString());
    }
}