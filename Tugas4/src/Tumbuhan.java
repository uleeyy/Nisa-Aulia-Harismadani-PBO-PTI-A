public class Tumbuhan {
    String nama;
    String jenisTumbuhan;
    double tinggi; 
    
    public Tumbuhan(String nama, String jenisTumbuhan, double tinggi){
        this.nama = nama;
        this.jenisTumbuhan = jenisTumbuhan;
        this.tinggi = tinggi;
    }

    void tumbuh() {
        System.out.println("Tumbuhan " + nama + " sedang tumbuh.");
    }

    // Metode berbunga
    void berbunga() {
        System.out.println("Tumbuhan " + nama + " sedang berbunga.");
    }

    // Metode berbuah
    void berbuah(String buah) {
        System.out.println("Tumbuhan " + nama + " berbuah " + buah + ".");
    }
}