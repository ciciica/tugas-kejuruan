/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab18soal2;

/**
 *
 * @author LENOVO
 */
public class Bab18soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        try {
            // Kode yang tidak menyebabkan eksepsi
            Float data = 500 / 15f; // Perbaiki pembagian menjadi float dengan '15f'
            System.out.println(data);
        } catch (NullPointerException e) {
            // Ini tidak akan dijalankan karena tidak ada NullPointerException
            System.out.println(e);
        } finally {
            // Ini akan selalu dijalankan
            System.out.println("Blok finally akan selalu di eksekusi");
        }
    }
}
 