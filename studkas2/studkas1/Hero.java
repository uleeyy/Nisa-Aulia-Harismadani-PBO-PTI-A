public class Hero {
    private String nama;
    private int hp;
    private int atk;

    public String getNama() {
        return nama;
    }
    
    // aksesor 
    public int getHp() {
        return this.hp;
    }

    public int getAtk() {
        return this.atk;
    }
    
    // mutator / setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Hero() {
        nama = "Yanto";
        hp = 100;
        atk = 50;
    }

    public Hero(String nama) {
        this.nama = nama;
        hp = 200;
        atk = 100;
    }

    public Hero(String nama, int hp, int atk) {
        this.nama = nama;
        this.hp = 200;
        this.hp = 100;

    }
    
}
