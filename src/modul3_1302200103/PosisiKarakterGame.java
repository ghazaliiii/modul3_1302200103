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
public class PosisiKarakterGame {
    private String state = "Berdiri";
    public void game(String command) {
        command = command.toLowerCase();
        switch (command) {
            case "s":
                this.state = "“tombol arah bawah ditekan";
                break;
            case "w":
                this.state = "tombol arah atas ditekan";
                break;
           
        }
    }
    public String getState(){
        return this.state;
        
    }
}
