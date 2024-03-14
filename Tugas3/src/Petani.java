class Petani {
    // Atribut
    public String nama;
    public int usia;

    // Constructor
    public Petani(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Metode tanam
    public void tanam(String tanaman) {
        System.out.println("Petani " + nama + " sedang menanam " + tanaman + ".");
    }

    // Metode panen
    public void panen() {
        System.out.println("Petani " + nama + " melakukan panen.");
    }

    // Metode menyiram
    public void menyiram() {
        System.out.println("Petani " + nama + " sedang menyiram tanaman.");
    }
}

 class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Petani
        Petani petani1 = new Petani("Roi", 35);

        // Memanggil metode dengan objek yang telah dibuat
        petani1.tanam("padi");
        petani1.panen();
        petani1.menyiram();
    }
}