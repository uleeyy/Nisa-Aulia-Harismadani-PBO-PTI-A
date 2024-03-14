import java.util.Scanner;
public class mainMobil { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        //instan objek bernama m1 
        Mobil m1 = new Mobil(); 
        System.out.print("Masukkan kecepatan mobil 1: ");
        int kecepatan1 = scanner.nextInt();
        m1.setKecepatan(kecepatan1); 

        System.out.print("Masukkan manufaktur mobil 1: ");
        String manufaktur1 = scanner.next();
        m1.setManufaktur(manufaktur1); 

        System.out.print("Masukkan nomor plat mobil 1: ");
        String noPlat1 = scanner.next();
        m1.setNoPlat(noPlat1); 

        System.out.print("Masukkan warna mobil 1: ");
        String warna1 = scanner.next();
        m1.setWarna(warna1);
        
        System.out.print("Masukkan waktu tempuh mobil 1: ");
        double waktu1 = scanner.nextDouble();
        m1.setWaktu(waktu1);
        
        System.out.print("Masukkan jarak tempuh mobil 1: ");
        double jarak1 = scanner.nextDouble();
        m1.setJarak(jarak1); 

        m1.displayMessage(); 
        System.out.println("================"); 

        //instan objek baru bernama m2 
        Mobil m2 = new Mobil(); 
        System.out.print("Masukkan kecepatan mobil 2: ");
        int kecepatan2 = scanner.nextInt();
        m2.setKecepatan(kecepatan2); 

        System.out.print("Masukkan manufaktur mobil 2: ");
        String manufaktur2 = scanner.next();
        m2.setManufaktur(manufaktur2); 

        System.out.print("Masukkan nomor plat mobil 2: ");
        String noPlat2 = scanner.next();
        m2.setNoPlat(noPlat2); 

        System.out.print("Masukkan warna mobil 2: ");
        String warna2 = scanner.next();
        m2.setWarna(warna2);
        
        System.out.print("Masukkan waktu tempuh mobil 2: ");
        double waktu2 = scanner.nextDouble();
        m1.setWaktu(waktu2);
        
        System.out.print("Masukkan jarak tempuh mobil 2: ");
        double jarak2 = scanner.nextDouble();
        m1.setJarak(jarak2);

        m2.displayMessage(); 
        System.out.println("================"); 

        //merubah warna dari objek m1 
        System.out.print("Masukkan warna baru untuk mobil 1: "); 
        String warnaBaru = scanner.next();
        m1.setWarna(warnaBaru); 

        //menampilkan hasil perubahan 
        m1.displayMessage(); 

        scanner.close();
    } 
}