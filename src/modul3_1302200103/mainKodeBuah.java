/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_1302200103;

/**
 *
 * @author faishal
 */
import java.util.Scanner;
public class mainKodeBuah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Buah : ");
        String kl = input.nextLine();
        System.out.println(KodeBuah.getKodeBuah(kl));
        input.close();
    }
}
