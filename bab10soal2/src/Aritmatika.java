/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab10soal2;

/**
 *
 * @author LENOVO
 */
public class Aritmatika {
    // Method untuk melakukan pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk melakukan perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method untuk melakukan pembagian
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return (double) a / b;
    }

    // Method untuk melakukan pangkat
    public double pangkat(int a, int b) {
        return Math.pow(a, b);
    }
}