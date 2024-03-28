public class Hewan {
    public String nama;
    public String habitat;
    public boolean jenisKelamin;

    // Constructor
    public Hewan(String nama, String habitat, boolean jenisKelamin) {
        this.nama = nama;
        this.habitat = habitat;
        this.jenisKelamin = jenisKelamin;
    }

    // Metode bersuara
    void bersuara(String suara) {
        System.out.println("Hewan " + nama + " bersuara " + suara + ".");
    }

    // Metode bergerak
    void bergerak() {
        System.out.println("Hewan " + nama + " bergerak.");
    }

    // Metode makan
    public void makan(String makanan) {
        System.out.println("Hewan " + nama + " sedang makan " + makanan + ".");
    }

    // Metode tidur
    void tidur() {
        System.out.println("Hewan " + nama + " tidur.");
    }
}