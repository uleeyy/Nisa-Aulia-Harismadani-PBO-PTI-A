public class KueJadi extends Kue {
    private double jumlah;
    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }
    public int getJumlah() {
        return (int) this.jumlah;
    }
    public double hitungHarga() {
        return this.jumlah * super.getHarga() * 2;
    }
    public String toString() {
        return super.toString() + "\nJumlah Kue\t\t: " + this.jumlah + "\nTotal Harga\t\t: " + hitungHarga() + "\nJenis Kue\t\t: Kue Jadi";
    } 
}