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
public class mainPosisiKarakterGame {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            PosisiKarakterGame game = new PosisiKarakterGame();
            System.out.println(game.getState());
            System.out.print("Command : ");
            String c = input.nextLine();
            game.game(c);
            System.out.println(game.getState());
            System.out.print("Command : ");
            c = input.nextLine();
            game.game(c);
            System.out.println(game.getState());
        }        
    }
}