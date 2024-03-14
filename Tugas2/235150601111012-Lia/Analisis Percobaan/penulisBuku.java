public class penulisBuku {
    private int jumlahHalaman; // Jumlah halaman buku
    private int kataPerHari; // Jumlah kata yang ditulis per hari

    // Konstruktor untuk inisialisasi objek PenulisBuku
    public penulisBuku(int jumlahHalaman, int kataPerHari) {
        this.jumlahHalaman = jumlahHalaman;
        this.kataPerHari = kataPerHari;
    }

    // Method untuk menghitung berapa hari Mahasiswa A membutuhkan untuk menulis 1 buku
    public int hitungHariSelesai() {
        int totalKata = jumlahHalaman * 200;  // Setiap halaman buku dapat menampung 200 kata (karena 1/2 halaman = 100 kata)
        return totalKata / kataPerHari;  // Jumlah hari yang dibutuhkan adalah total kata dibagi dengan kata yang ditulis per hari
    }

    // Method main memanggil objek class penulisBuku
    public static void main(String[] args) { 
        // Membuat objek PenulisBuku dengan 50 halaman dan menulis 100 kata per hari
        penulisBuku penulis = new penulisBuku(100, 100);
        // Menghitung berapa hari yang dibutuhkan untuk menulis 1 buku
        int hariSelesai = penulis.hitungHariSelesai();
        // Menampilkan hasil
        System.out.println("Mahasiswa A memerlukan " + hariSelesai + " hari untuk menyelesaikan 1 buku.");
    }
}