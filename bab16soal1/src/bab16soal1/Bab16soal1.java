/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab16soal1;

/**
 *
 * @author LENOVO
 */
public class Bab16soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 9.5;
        double b = 2.5;

        // Membuat objek dari kelas Operation
        Operation operation = new Operation(a, b);

        // Menampilkan hasil operasi
        System.out.println("Penjumlahan: " + operation.add());
        System.out.println("Pengurangan: " + operation.subtract());
        System.out.println("Perkalian: " + operation.multiply());
        System.out.println("Pembagian: " + operation.divide());
    }
    
}
