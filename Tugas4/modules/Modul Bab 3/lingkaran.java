public class lingkaran {
    int alas, tinggi;

    public lingkaran(int alas) {
        this.alas = alas;
    }

    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public lingkaran(String alas, String tinggi) {
        this.alas = parseInt(alas);
        this.tinggi = parseInt(tinggi);
    }

    private int parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Error: Tidak dapat melakukan parsing string menjadi integer.");
            return 0; 
        }
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }
}

public	class MainLingkaran {
    public static void main(String[] args) {
        lingkaran l = new lingkaran (3);
        l.setTinggi (10);
        l.displayMessage();
        lingkaran l2 = new lingkaran (4, 10);
        l2.displayMessage();
        lingkaran Lstring = new lingkaran("5", "8");
        Lstring.displayMessage();
    }
}