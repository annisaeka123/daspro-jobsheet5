/**
 * TugasDiskusiSistemAkademik
 */
import java.util.Scanner;
 public class TugasDiskusiSistemAkademik {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        String level;

        System.out.print("Level: ");
        level = input03.next();

        if (level.equals ("admin")) {
            System.out.println("Dashboard Admin");
        }
        else if (level.equals ("dosen")) {
            System.out.println("Dashboard Dosen");
        }
        else if (level.equals ("mahasiswa")) {
            System.out.println("Dashboard Mahasiswa");
        }
        else {
            System.out.println("Tidak Ditemukan");
        }
    }
}