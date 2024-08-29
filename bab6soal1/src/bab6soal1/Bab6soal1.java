/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab6soal1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Bab6soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Membuat objek Scanner untuk membaca input
       Scanner scanner = new Scanner(System.in);
       
       //Meminta input NIM dari pengguna
       System.out.print("NIM ? : ");
       String nim = scanner.nextLine();
       
       //Meminta input Nama dari pengguna
       System.out.print("NAMA ? : ");
       String nama = scanner.nextLine();
       
       //Meminta input Nilai dari pengguna
       System.out.print("Nilai ? : ");
       int nilai = scanner.nextInt();
       
       //Menemukan grade berdasarkan dari
       char grade;
       if (nilai >= 85){
           grade = 'A';
       } else if (nilai >= 70) {
           grade = 'B';
       } else if (nilai >= 55) {
           grade = 'C';
       } else if (nilai >= 40) {
           grade = 'D';
       } else {
           grade = 'E';
       }
       
       // Menampilkan output grade
       System.out.println("Grade : " + grade);
       
       //Menutup scanner
       scanner.close();
       
      
    }
    
}
