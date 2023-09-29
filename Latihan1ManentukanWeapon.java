/**
 * Latihan1ManentukanWeapon
 */

import java.util.Scanner;
 public class Latihan1ManentukanWeapon {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        int jarak;

        System.out.print("Masukkan jarak: ");
        jarak = input03.nextInt();

        String status = (jarak <= 5) ? "melee weapon" : "ranged weapon";
        System.out.println("Gunakan " + status);
    }
}