import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        long yearsWorked = ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
        if (yearsWorked >= 0 && yearsWorked <= 5) {
            return gaji * 0.05;
        } else if (yearsWorked > 5 && yearsWorked <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Tahun Masuk: " + tahunMasuk + "\n" +
                "Jumlah Anak: " + jumlahAnak + "\n" +
                "Gaji: $" + String.format("%.2f", gaji) + "\n" +
                "Bonus: $" + String.format("%.2f", getBonus()) + "\n" +
                "Total Pendapatan: $" + String.format("%.2f", gaji + getBonus() + jumlahAnak * 20);
    }
}