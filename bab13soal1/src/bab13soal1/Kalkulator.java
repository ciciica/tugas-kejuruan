/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab13soal1;

/**
 *
 * @author LENOVO
 */
public class Kalkulator {
    // Method untuk penjumlahan dengan 2 parameter
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan dengan 2 parameter
    public int kurang(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian dengan 2 parameter
    public int kali(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian dengan 2 parameter
    public double bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return (double) a / b;
    }
}
