/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Bab9soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai awal dan nilai akhir
        System.out.println("Tahun Akhir ? : ");
        int tahunAkhir = scanner.nextInt();
        
        System.out.println("Tahun Awal ? : ");
        int tahunAwal = scanner.nextInt();
        
        // Mnampilkan tahun dari tahun akhir hingga tahun awal
        int jumlah = 1;
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
            jumlah++;
            
            // Menutup Scanner
            scanner.close();
        }
    }
    
}
