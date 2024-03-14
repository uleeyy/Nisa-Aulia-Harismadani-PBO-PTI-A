class Hewan {
    // Atribut
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
    public void bersuara(String suara) {
        System.out.println("Hewan " + nama + " bersuara " + suara + ".");
    }

    // Metode bergerak
    public void bergerak() {
        System.out.println("Hewan " + nama + " bergerak.");
    }

    // Metode makan
    public void makan(String makanan) {
        System.out.println("Hewan " + nama + " sedang makan " + makanan + ".");
    }

    // Metode tidur
    public void tidur() {
        System.out.println("Hewan " + nama + " tidur.");
    }
}

class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Hewan
        Hewan kucing = new Hewan("Kucing", "Darat", true);

        // Memanggil metode dengan objek yang telah dibuat
        kucing.bersuara("Meoww");
        kucing.bergerak();
        kucing.makan("Ikan");
        kucing.tidur();
    }
}