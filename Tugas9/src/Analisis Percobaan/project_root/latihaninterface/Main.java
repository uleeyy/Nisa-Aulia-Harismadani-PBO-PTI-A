package project_root.latihaninterface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        Hewan hewan = new Hewan(name, age);

        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
        hewan.tampilkanNama();
        hewan.tampilkanUmur();
    }
}
