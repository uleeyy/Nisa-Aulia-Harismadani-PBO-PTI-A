public class Main {
    public static void main(String[] args) {
        Kue[] kues = new Kue[20];
        kues[0] = new KuePesanan("Lemper", 1000, 6);
        kues[1] = new KuePesanan("Bolu", 2000, 5);
        kues[2] = new KuePesanan("Pastel", 1000, 7);
        kues[3] = new KuePesanan("Kue Lapis", 1500, 2);
        kues[4] = new KuePesanan("Bolu kukus", 1500, 4);
        kues[5] = new KuePesanan("Red Velvet", 5000, 3);
        kues[6] = new KuePesanan("Bika Ambon", 2500, 5);
        kues[7] = new KuePesanan("Kue Cucur", 1500, 2);
        kues[8] = new KuePesanan("Kue Apem", 1000, 9);
        kues[9] = new KuePesanan("Naga Sari", 1000, 8);
        kues[10] = new KueJadi("Lemper", 1000, 23);
        kues[11] = new KueJadi("Bolu", 2000, 45);
        kues[12] = new KueJadi("Pastel", 1000, 21);
        kues[13] = new KueJadi("Kue Lapis", 1500, 10);
        kues[14] = new KueJadi("Bolu kukus", 1500, 5);
        kues[15] = new KueJadi("Red Velvet", 5000, 8);
        kues[16] = new KueJadi("Bika Ambon", 2500, 25);
        kues[17] = new KueJadi("Kue Cucur", 1500, 17);
        kues[18] = new KueJadi("Kue Apem", 1000, 11);
        kues[19] = new KueJadi("Naga Sari", 1000, 3);
        System.out.println(); System.out.println("Kue Pesanan : "); System.out.println();
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
        System.out.println(""); System.out.println("Kue Jadi : ");
        System.out.println(""); System.out.println();

                   } System.out.println(kues[i].toString());
        System.out.println(); }
        double totalHarga = 0;
       for (int i = 0; i < 20; i++) {
           totalHarga += kues[i].hitungHarga();
       }
       double hargaP = 0;
       double beratP = 0;
       String jumlahJ = null;
       for (int i = 0; i < 10; i++) {
           hargaP += kues[i].hitungHarga();
           if (kues[i] instanceof KuePesanan) {
            KuePesanan pesanan = (KuePesanan) kues [i];
            KueJadi jadi = null;
            jumlahJ += jadi.getJumlah();
        }
               }
               double harga[] = new double[20];
               for (int i = 0; i < 20; i++) {
                   harga[i] = kues[i].hitungHarga();
               }
        String termahal = "";
        double tertinggi = getTertinggi(harga); for (int
        j = 0; j < 20; j++) {
                   if (kues[j].hitungHarga() == tertinggi) {
                       termahal = kues[j].getNama();
                   }
        }
        System.out.println("==================================== ========");
        System.out.println("Total Harga Kue\t\t\t: Rp. " + totalHarga);
        System.out.println("Total Harga Kue Pesanan\t: Rp. " + hargaP);
        System.out.println("Total Berat Kue Pesanan\t: "+ beratP);
        String hargaJ = null;
        System.out.println("Total Harga Kue Jadi\t: Rp. " + hargaJ);
        System.out.println("Total Jumlah Kue Jadi\t: " + jumlahJ);
        System.out.println("Kue Termahal\t\t\t: " + termahal); 
        System.out.println("============================================");
   }
   public static double getTertinggi(double[]inputArray)
                                            
double nilaiTertinggi = inputArray[0];
for (int i = 1; i < inputArray.length; i++) {
    if (inputArray[i] > nilaiTertinggi) {
        nilaiTertinggi = inputArray[i];
}}
return nilaiTertinggi;