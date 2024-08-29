/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab13soal2;

/**
 *
 * @author LENOVO
 */
public class Bab13soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek SegitigaLuas
        SegitigaLuas segitiga = new SegitigaLuas(10, 5);
        
        // Menghitung luas menggunakan method overriding
        double luas = segitiga.hitungLuas();

        // Menampilkan hasil
        System.out.println("Luas segitiga: " + luas);
    }
}