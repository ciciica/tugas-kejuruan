/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab13soal1;

/**
 *
 * @author LENOVO
 */
public class Bab13soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
        
        // Nilai yang akan digunakan dalam operasi
        int a = 20;
        int b = 10;

        // Menghitung dan menampilkan hasil operasi
        System.out.println("Hasil Pertambahan : " + kalkulator.tambah(a, b));
        System.out.println("Hasil Pengurangan : " + kalkulator.kurang(a, b));
        System.out.println("Hasil Perkalian   : " + kalkulator.kali(a, b));
        System.out.println("Hasil Pembagian   : " + kalkulator.bagi(a, b));
    }
    
}
