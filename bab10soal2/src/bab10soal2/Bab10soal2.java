/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab10soal2;

/**
 *
 * @author LENOVO
 */
public class Bab10soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Aritmatika3
        Aritmatika Aritmatika = new Aritmatika();

        // Nilai untuk operasi
        int bilangan1 = 10;
        int bilangan2 = 5;

        // Mengakses dan menampilkan hasil dari metode pengurangan
        int hasilPengurangan = Aritmatika.pengurangan(bilangan1, bilangan2);
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);

        // Mengakses dan menampilkan hasil dari metode perkalian
        int hasilPerkalian = Aritmatika.perkalian(bilangan1, bilangan2);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);

        // Mengakses dan menampilkan hasil dari metode pembagian
        try {
            double hasilPembagian = Aritmatika.pembagian(bilangan1, bilangan2);
            System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Mengakses dan menampilkan hasil dari metode pangkat
        double hasilPangkat = Aritmatika.pangkat(bilangan1, bilangan2);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}