/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab16soal2;

/**
 *
 * @author LENOVO
 */
public class Bab16soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 9.5;
        double b = 2.5;

        // Array dari objek ArithmeticOperation
        ArtimatikaOperasi[] operations = {
            new Addition(a, b),
            new Subtraction(a, b),
            new Multiplication(a, b),
            new Division(a, b)
        };

        // Menampilkan hasil dari setiap operasi
        for (ArtimatikaOperasi operation : operations) {
            System.out.println("Hasil Operasi: " + operation.performOperation());
        }
    }
    
}
