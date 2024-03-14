import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class perpustakaan {
    private String[] kategori = {"Teknologi", "Filsafat", "Sejarah", "Agama", "Psikologi", "Politik", "Fiksi"};
    private String[][] buku = {
        {"Pemrograman Java: Konsep Dasar", "Pemrograman Python: Panduan Lengkap", "Pengembangan Aplikasi Android: Teknik Terbaru", "Big Data dan Analisis: Pendekatan Praktis", "Jaringan Komputer: Dasar-Dasar Komunikasi Data"},
        {"Filsafat Hidup: Menuju Kebahagiaan Abadi", "Filsafat Ilmu: Perspektif Modern", "Filsafat Politik: Teori dan Aplikasi", "Filsafat Seni: Ekspresi Kreatif Manusia", "Etika Bisnis: Panduan Profesionalisme"},
        {"Sejarah Dunia: Perjalanan Peradaban Manusia", "Sejarah Indonesia: Dari Masa Pra-Kolonial Hingga Kemerdekaan", "Sejarah Asia Tenggara: Dinamika Budaya dan Politik", "Sejarah Perang Dunia II: Konflik Global yang Mengubah Dunia", "Sejarah Islam: Perkembangan dan Pengaruhnya"},
        {"Agama-agama Dunia: Kepercayaan dan Praktik", "Al-Quran: Panduan Hidup dalam Kehidupan Modern", "Kitab Suci Hindu: Keseimbangan Spiritual dan Materi", "Injil Perjanjian Baru: Ajaran Kasih dan Pengampunan", "Buddha Dharma: Jalan Menuju Kebijaksanaan Abadi"},
        {"Psikologi Klinis: Diagnosis dan Penanganan Gangguan Mental", "Psikologi Sosial: Interaksi Manusia dalam Masyarakat", "Psikologi Anak: Pembentukan Karakter dan Perkembangan Emosional", "Psikologi Industri: Produktivitas dan Kesejahteraan Kerja", "Psikologi Kepribadian: Teori dan Aplikasi dalam Kehidupan Sehari-hari"},
        {"Politik Global: Tren dan Tantangan Abad ke-21", "Politik Demokrasi: Partisipasi Publik dalam Pembangunan Negara", "Politik Ekonomi: Dinamika Kekuasaan dan Kesejahteraan Rakyat", "Politik Lingkungan: Perlindungan Alam dalam Kebijakan Publik", "Politik Identitas: Pergeseran Pemikiran dalam Kebudayaan Modern"},
        {"Fiksi Ilmiah: Petualangan di Luar Angkasa", "Fiksi Fantasi: Dunia Ajaib dan Makhluk Gaib", "Fiksi Misteri: Teka-teki Kriminal yang Tak Terpecahkan", "Fiksi Romansa: Kisah Cinta yang Mengharukan", "Fiksi Petualangan: Pengembaraan ke Negeri yang Belum Terjamah"}
    };
    private String[][] penulis = {
        {"Agus Setiawan", "Budi Santoso", "Citra Dewi", "Dharma Wirawan", "Eka Putri"},
        {"Fauzi Rahman", "Gita Wijaya", "Hadi Susilo", "Indah Kusuma", "Joko Suryanto"},
        {"Kartika Dewi", "Lukman Hakim", "Mega Wulandari", "Nadia Fitri", "Oscar Simamora"},
        {"Putri Mulia", "Rahmat Hidayat", "Sari Indah", "Taufik Hidayat", "Ulfa Zahra"},
        {"Vina Putri", "Wahyu Surya", "Xavier Aditya", "Yuli Widiastuti", "Zainal Abidin"},
        {"Zara Ananda", "Ardian Saputra", "Bella Permatasari", "Cahya Pradana", "Dedi Gunawan"},
        {"Edi Santoso", "Fika Cahaya", "Gerry Pratama", "Helen Anggraeni", "Iwan Setiawan"}
    };

    public void tampilkanBuku() {
        for (int i = 0; i < kategori.length; i++) {
            System.out.println("Kategori: " + kategori[i]);
            System.out.println("Daftar Buku:");
            for (int j = 0; j < buku[i].length; j++) {
                System.out.println("- " + buku[i][j] + " oleh " + penulis[i][j]);
            }
            System.out.println();
        }
    }

    public void tulisKeFile(String namaFile) {
        try {
            FileWriter writer = new FileWriter(namaFile);
            for (int i = 0; i < kategori.length; i++) {
                writer.write("Kategori: " + kategori[i] + "\n");
                writer.write("Daftar Buku:\n");
                for (int j = 0; j < buku[i].length; j++) {
                    writer.write("- " + buku[i][j] + " oleh " + penulis[i][j] + "\n");
                }
                writer.write("\n");
            }
            writer.close();
            System.out.println("Terima kasih atas kunjungannnya");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        perpustakaan perpustakaan = new perpustakaan();
        System.out.println("SELAMAT DATANG DI PERPUTAKAAN GUAA");
        perpustakaan.tampilkanBuku();
        perpustakaan.tulisKeFile("library_txt");
    }
}