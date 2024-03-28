import java.util.Scanner;
public class MainStudent {
    static int jumlahObjek = 0; 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        Student[] student = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nMasukkan data untuk siswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String name = scanner.nextLine();
            System.out.print("Alamat: ");
            String address = scanner.nextLine();
            System.out.print("Umur: ");
            int age = scanner.nextInt();
            System.out.print("Nilai Matematika: ");
            double mathGrade = scanner.nextDouble();
            System.out.print("Nilai Bahasa Inggris: ");
            double englishGrade = scanner.nextDouble();
            System.out.print("Nilai IPA: ");
            double scienceGrade = scanner.nextDouble();

            student[i] = new Student(name, address, age, mathGrade, englishGrade, scienceGrade);
            scanner.nextLine();

            // Menambah jumlah objek setiap kali objek Student dibuat
            jumlahObjek++;
        }

        System.out.println("\nData siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nData siswa ke-" + (i + 1) + ":");
            student[i].displayMessage();
        }
        
        jumlahObjek(); // Memanggil method jumlahObjek() untuk menampilkan jumlah objek yang dibuat
        scanner.close();
    }

    // Method untuk menampilkan jumlah objek yang telah dibuat
    public static void jumlahObjek() {
        System.out.println("\nJumlah objek Student yang dibuat: " + jumlahObjek);
    }
}