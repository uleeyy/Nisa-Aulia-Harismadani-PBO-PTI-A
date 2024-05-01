import java.time.LocalDate;
public class TestCase {
    public static void main(String[] args) {
        // Manusia - Laki-laki telah menikah
        Manusia lakiLakiMenikah = new Manusia("Rama", true, "1234567890", true);
        System.out.println(lakiLakiMenikah.toString());

        // Manusia - Perempuan telah menikah
        Manusia perempuanMenikah = new Manusia("Salsa", false, "0987654321", true);
        System.out.println(perempuanMenikah.toString());

        // Manusia - Belum menikah
        Manusia belumMenikah = new Manusia("Angga", true, "9876543210", false);
        System.out.println(belumMenikah.toString());

        // MahasiswaFilkom - Ipk < 3
        MahasiswaFILKOM ipk3 = new MahasiswaFILKOM("Rama", true, "1234567890", false, "165150600001", 2.5);
        System.out.println(ipk3.toString());

        // MahasiswaFilkom - Ipk 3 - 3.5
        MahasiswaFILKOM ipk35 = new MahasiswaFILKOM("Salsa", false, "0987654321", true, "165150633301", 3.25);
        System.out.println(ipk35.toString());

        // MahasiswaFilkom - Ipk 3.5 - 4
        MahasiswaFILKOM ipk4 = new MahasiswaFILKOM("Angga", true, "9876543210", true, "165150635001", 3.75);
        System.out.println(ipk4.toString());

        // Pekerja - Lama bekerja 2 tahun, anak 2
        Pekerja pekerja2tahun2anak = new Pekerja("Rama", true, "1234567890", true, 5000, LocalDate.of(2020, 1, 1), 2);
        System.out.println(pekerja2tahun2anak.toString());

        // Pekerja - Lama bekerja 9 tahun
        Pekerja pekerja9tahun = new Pekerja("Salsa", false, "0987654321", true, 6000, LocalDate.of(2012, 1, 1), 0);
        System.out.println(pekerja9tahun.toString());

        // Pekerja - Lama bekerja 20 tahun, anak 10
        Pekerja pekerja20tahun10anak = new Pekerja("Angga", true, "9876543210", true, 8000, LocalDate.of(2000, 1, 1), 10);
        System.out.println(pekerja20tahun10anak.toString());

        // Manager - Lama bekerja 15 tahun dengan gaji $7500
        Manager manager = new Manager("Rama", false, "0987654321", true, 7500, LocalDate.of(2006, 1, 1), 0, "IT");
        System.out.println(manager.toString());
    }
}