/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktekadit01;

/**
 *
 * @author ACER-PC
 */
public class Avanza_MobilAksi {
    public static void main(String[] args) {
        Avanza_Mobil Bapak = new Avanza_Mobil();
        
        Bapak.Merk="Toyota";
        Bapak.Warna="Merah";
        Bapak.CC="1500cc";
        Bapak.Velg="Bintang";
        Bapak.Ban="Tubles";
        
        Bapak.cetakInfo();
    }
}
