public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    public boolean isRasional() {
        return (penyebut != 0);
    }

    public void Sederhana() {
        if (penyebut == 0) {
            return;
        }
        int gcd = gcd(pembilang, penyebut);
        pembilang /= gcd;
        penyebut /= gcd;
    }

    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    public void negasi() {
        pembilang = -pembilang;
    }

    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    // Operator <
    public boolean lessThan(Rasional A) {
        double thisValue = Cast();
        double otherValue = A.Cast();
        return thisValue < otherValue;
    }

    // Operator <=
    public boolean lessThanOrEqualTo(Rasional A) {
        double thisValue = Cast();
        double otherValue = A.Cast();
        return thisValue <= otherValue;
    }

    // Operator >=
    public boolean greaterThanOrEqualTo(Rasional A) {
        double thisValue = Cast();
        double otherValue = A.Cast();
        return thisValue >= otherValue;
    }

    // Operator -
    public Rasional kurang(Rasional A) {
        int newPembilang = (pembilang * A.penyebut) - (A.pembilang * penyebut);
        int newPenyebut = penyebut * A.penyebut;
        return new Rasional(newPembilang, newPenyebut);
    }

    // Operator *
    public Rasional kali(Rasional A) {
        int newPembilang = pembilang * A.pembilang;
        int newPenyebut = penyebut * A.penyebut;
        return new Rasional(newPembilang, newPenyebut);
    }

    // Operator /
    public Rasional bagi(Rasional A) {
        int newPembilang = pembilang * A.penyebut;
        int newPenyebut = penyebut * A.pembilang;
        return new Rasional(newPembilang, newPenyebut);
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }

    // Fungsi untuk mencari FPB (Faktor Persekutuan Terbesar) menggunakan algoritma Euclidean
    private int gcd(int a, int b) {
        int temp;
        for (temp = b; b != 0; temp = b, b = a % b, a = temp);
        return a;
    }
}