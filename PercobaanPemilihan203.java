/**
 * PercobaanPemilihan203
 */
import java.util.Scanner;
 public class PercobaanPemilihan203 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        System.out.print("Nilai UAS: ");
        float uas = input03.nextFloat();
        System.out.print("Nilai UTS: ");
        float uts = input03.nextFloat();
        System.out.print("Nilai kuis: ");
        float kuis = input03.nextFloat();
        System.out.print("Nilai tugas: ");
        float tugas = input03.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String huruf;

        if (total > 80 && total <= 100) {
            huruf = "A";
        } else if (total > 73 && total <= 80) {
            huruf = "B+";
        } else if (total > 65 && total <= 73) {
            huruf = "B";
        } else if (total > 60 && total <= 65) {
            huruf = "C+";
        } else if (total > 50 && total <= 60) {
            huruf = "C";
        } else if (total > 39 && total <= 50) {
            huruf = "D";
        } else if (total <= 39) {
            huruf = "E";
        } else {
            huruf = "Nilai tidak valid";
        }

        System.out.println("Nilai akhir = " + total + " sehingga nilai huruf adalah " + huruf);
    }
}
