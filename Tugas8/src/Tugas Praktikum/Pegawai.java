public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public double hitungUpah() {
        return 0.0;
    }

    public double hitungGaji() {
        return 0.0;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("No. KTP: " + noKTP);
    }
}