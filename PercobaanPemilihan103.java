/**
 * PercobaanPemilihan103
 */
import java.util.Scanner;

 public class PercobaanPemilihan103 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input03.nextInt();

        String status = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println("Angka " + angka + " " + status);
    }
}

