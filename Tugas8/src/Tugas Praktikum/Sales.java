public class Sales extends Pegawai {
    private double totalPenjualan;
    private double Komisi;

    public Sales(String nama, String noKTP, double totalPenjualan, double Komisi) {
        super(nama, noKTP);
        this.totalPenjualan = totalPenjualan;
        this.Komisi = Komisi;
    }

    @Override
    public double hitungUpah() {
        return totalPenjualan * Komisi;
    } 
}