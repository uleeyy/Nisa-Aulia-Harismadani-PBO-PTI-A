public abstract class Kue {
    // Atribut
    private String nama;
    private double harga;
    
    // Konstruktor
    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    // Getter untuk nama
    public String getNama() {
        return nama;
    }
    
    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Getter untuk harga
    public double getHarga() {
        return harga;
    }
    
    // Setter untuk harga
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Metode abstrak hitungHarga
    public abstract double hitungHarga();
    
    // Implementasi metode toString
    @Override
    public String toString() {
        return "Nama Kue: " + nama + ", Harga: " + harga;
    }
}
