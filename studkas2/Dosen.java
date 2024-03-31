package studkas2;
public class Dosen {
    public String nama;
    public String NIDN;

    public Dosen(String nama, String NIDN) {
        this.nama = nama;
        NIDN = NIDN;
    }
    
    void mengajar(String universitas) {
        System.out.println(this.nama + " mengajar di universitas " + universitas);
    }

    void mengajar(MataKuliah mk) {
        System.out.println(this.nama + " mengajar mata kuliah " + mk.namaMataKuliah);
    }

    void mengajar(Mahasiswa mhs) {
        System.out.println(this.nama + " mengajar mahasiswa dengan nama " + mhs.nama);
    }

    void mengajar() {
        
    }
}