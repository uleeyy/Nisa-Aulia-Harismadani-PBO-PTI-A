public class Petani {
    public String nama;
    public int usia;

    
    public Petani(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public Petani(String nama) {
        this.nama = nama;
    }

    public Petani(int usia) {
        this.usia = usia;
    }

    public void tanam(String tanaman) {
        System.out.println("Petani " + nama + " sedang menanam " + tanaman + ".");
    }

    public void panen() {
        System.out.println("Petani " + nama + " melakukan panen.");
    }

    public void menyiram() {
        System.out.println("Petani " + nama + " sedang menyiram tanaman.");
    }
}

 class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Petani
        Petani petani1 = new Petani("Roi", 35);
        Petani petani2 = new Petani("John");
        Petani petani3 = new Petani(40);

        // Memanggil metode dengan objek yang telah dibuat
        petani1.tanam("padi");
        petani1.panen();
        petani1.menyiram();
    }
}