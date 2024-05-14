public class Main {
    public static void main(String[] args) {
        
        PegawaiTetap pegawai1 = new PegawaiTetap("Bayu", 
    "350728490327424892342", 2000000.0);
        PegawaiHarian pegawai2 = new PegawaiHarian("Edo", 
    "350728490327424892343", 8500.0, 40);
        Sales pegawai3 = new Sales("Tika", 
    "350728490327424892344", 50.0, 50000.0);

        System.out.println();
        System.out.println("===================");
        System.out.println("Informasi Pegawai:");
        System.out.println("===================");
        System.out.println();

        System.out.println("==============================");
        pegawai1.tampilkanInfo();
        System.out.println("upah: 200000" + pegawai1.hitungGaji());
        System.out.println("pendapatan: 200000" + pegawai1.hitungGaji());
        System.out.println("==============================");
        System.out.println();

        System.out.println("==============================");
        pegawai2.tampilkanInfo();
        System.out.println("upahPerJam: 850" + pegawai2.hitungGaji());
        System.out.println("totalJamKerja: 4" + pegawai1.hitungGaji());
        System.out.println("pendapatan: 34000" + pegawai1.hitungGaji());
        System.out.println("==============================");
        System.out.println();

        System.out.println("==============================");
        pegawai3.tampilkanInfo();
        System.out.println("totalPenjualan: 5" + pegawai3.hitungGaji());
        System.out.println("komisi: 5000" + pegawai1.hitungGaji());
        System.out.println("pendapatan: 250000" + pegawai1.hitungGaji());
        System.out.println("==============================");
        System.out.println();
    } 
}