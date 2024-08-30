/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab15soal1;

/**
 *
 * @author LENOVO
 */
public class Kalkulator {
  public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method pembagian
    public float pembagian(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }

    // Method perkalian
    public float perkalian(float a, float b) {
        return a * b;
    }
}

