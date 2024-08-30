/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab18soall1a;

/**
 *
 * @author LENOVO
 */
public class Bab18soall1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // Kode yang mungkin menyebabkan eksepsi
            int result = 10 / 0;  // Ini akan menyebabkan ArithmeticException
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            // Menangkap dan menangani eksepsi
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        
        System.out.println("Program tetap berjalan...");

    }
    
}
