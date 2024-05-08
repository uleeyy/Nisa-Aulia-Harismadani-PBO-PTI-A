public class KuePesanan {
    private Kue jenisKue;
    private int jumlah;
    private String namaPemesan;
    public KuePesanan(Kue string, int jumlah, String i) {
        this.jenisKue = string;
        this.jumlah = jumlah;
        this.namaPemesan = i;
    }
    public KuePesanan(String string, int jumlah2, int i) {
        //TODO Auto-generated constructor stub
    }
    public Kue getJenisKue() {
        return jenisKue;
    }
    public void setJenisKue(Kue jenisKue) {
        this.jenisKue = jenisKue;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public String getNamaPemesan() {
        return namaPemesan;
    }
    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }
    public double getTotalHarga() {
        return jenisKue.getHarga() * jumlah;
    }
    @Override
    public String toString() {
        return "Pesanan untuk " + namaPemesan + ", " + jumlah + " " + jenisKue.getNama() + " dengan total harga " + getTotalHarga();
} }