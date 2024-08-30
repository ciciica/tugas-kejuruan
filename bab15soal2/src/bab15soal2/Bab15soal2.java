/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab15soal2;

/**
 *
 * @author LENOVO
 */
public class Bab15soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 9.5;
        double b = 2.5;

        // Operasi Pengurangan
        KalkulatorKurang kurang = new KalkulatorKurang(a, b);
        System.out.println("Pengurangan: " + kurang.kurang());

        // Operasi Perkalian
        KalkulatorKali kali = new KalkulatorKali(a, b);
        System.out.println("Perkalian: " + kali.kali());

        // Operasi Pembagian
        KalkulatorBagi bagi = new KalkulatorBagi(a, b);
        System.out.println("Pembagian: " + bagi.bagi());
    }
}
