package studkas2;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("pak Aryo", "0856");
        MataKuliah matkul = new MataKuliah("ABCD", "PBO", 3);
        Mahasiswa mahasiswa = new Mahasiswa("Lia", "235150601111012");

        dosen.mengajar("brawijaya");
        dosen.mengajar("PBO");
        dosen.mengajar("Lia");  
    }  
}