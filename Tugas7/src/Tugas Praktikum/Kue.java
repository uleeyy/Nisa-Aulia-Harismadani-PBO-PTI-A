abstract class Kue {
   private String nama;
   private int jumlah;
   private int harga;
   public Kue(String nama, int jumlah, int harga) {
       this.nama = nama;
       this.jumlah = jumlah;
       this.harga = harga;
   }
   public Kue(String nama, double harga) {
   }
   public String getNama() {
       return nama;
   }
   public void setNama(String nama) {
       this.nama = nama;
   }
   public int getJumlah() {
       return jumlah;
   }
   public void setJumlah(int jumlah) {
       this.jumlah = jumlah;
   }
   public int getHarga() {
       return harga;
   }
   public void setHarga(int harga) {
       this.harga = harga;
   }
   public int hitungTotalHarga() {
       return jumlah * harga;
   }
   public String toString() {
       return "Nama kue: " + nama + "\nJumlah kue: " + jumlah + "\nHarga per kue: " + harga + "\nTotal harga: " + hitungTotalHarga();
} }