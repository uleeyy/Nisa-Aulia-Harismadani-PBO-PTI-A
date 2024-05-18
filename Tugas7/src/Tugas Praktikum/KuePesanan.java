public class KuePesanan extends Kue {
    protected double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    @Override
    public String toString() {
        return "Kue Pesanan - " + super.toString() + ", Berat: " + berat + " kg";
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
}