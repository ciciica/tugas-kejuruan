/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab18soallb;

/**
 *
 * @author LENOVO
 */
public class Bab18soallB {

    /**
     * @param args the command line arguments
     */
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Usia harus lebih dari atau sama dengan 18.");
        } else {
            System.out.println("Usia valid: " + age);
        }
    }
    public static void main(String[] args) {
                System.out.println("Hello World!");
                try {
            // Menggunakan metode yang dapat melempar eksepsi
            checkAge(16);  // Ini akan melempar IllegalArgumentException
        } catch (IllegalArgumentException e) {
            // Menangkap dan menangani eksepsi
            System.out.println("Kesalahan: " + e.getMessage());
        }
        
        System.out.println("Program tetap berjalan...");
    }
}
    
