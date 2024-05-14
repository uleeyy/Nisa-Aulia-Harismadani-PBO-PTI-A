public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJamKerja;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJamKerja) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJamKerja = totalJamKerja;
    }

    @Override
    public double hitungUpah() {
        if (totalJamKerja <= 40) {
            return upahPerJam * totalJamKerja;
        } else {
            int jamNormal = 40;
            int jamLembur = totalJamKerja - jamNormal;
            return (upahPerJam * jamNormal) + (upahPerJam * jamLembur * 1.5);
        }
    }
}