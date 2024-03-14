class Tumbuhan {
    // Atribut
    public String nama;
    public String jenis;
    public double tinggi;

    // Constructor
    public Tumbuhan(String nama, String jenis, double tinggi) {
        this.nama = nama;
        this.jenis = jenis;
        this.tinggi = tinggi;
    }

    // Metode tumbuh
    public void tumbuh() {
        System.out.println("Tumbuhan " + nama + " sedang tumbuh.");
    }

    // Metode berbunga
    public void berbunga() {
        System.out.println("Tumbuhan " + nama + " sedang berbunga.");
    }

    // Metode berbuah
    public void berbuah(String buah) {
        System.out.println("Tumbuhan " + nama + " berbuah " + buah + ".");
    }
}

class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Tumbuhan
        Tumbuhan pohon = new Tumbuhan("Pohon Mangga", "Buah-buahan", 2.5);

        // Memanggil metode dengan objek yang telah dibuat
        pohon.tumbuh();
        pohon.berbunga();
        pohon.berbuah("mangga");
    }
}