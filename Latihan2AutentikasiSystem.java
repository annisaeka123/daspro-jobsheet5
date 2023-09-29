/**
 * Latihan2AutentikasiSystem
 */
import java.util.Scanner;
 public class Latihan2AutentikasiSystem {

   public static void main(String[] args) {
      Scanner input03 = new Scanner(System.in);
      String user = "Annisa";
      String pass = "Eka";

      System.out.print("Masukkan username: ");
      user = input03.next();
      System.out.print("Masukkan password: ");
      pass = input03.next();

      if (user == "Annisa " && pass == "Eka") {
         System.out.println("Masuk System");
      }
      else {
         System.out.println("Username dan Password salah");
      }
   }
}