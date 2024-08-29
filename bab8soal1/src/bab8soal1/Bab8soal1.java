/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8soal1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Bab8soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //input nilai awal dan nilai akhir
        System.out.println("Nilai Awal ? : ");
        int nilaiAwal = scanner.nextInt();
        
        System.out.println("Nilai Akhir ? : ");
        int nilaiAkhir = scanner.nextInt();
        
        // Menampilkan bilangan pertambahan 5
        int jumlah = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(jumlah + " . " + i);
            jumlah++;
            
            // Menutup Scanner
            scanner.close();
        }
    }
    
}
