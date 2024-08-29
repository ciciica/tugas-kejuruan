/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab11soal2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Bab11soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);
      
       // input ID Karyawan
       System.out.println("Masukkan ID Karyawan: ");
       String idKaryawan = scanner.nextLine();
       
       // Input Nama Karyawan
       System.out.println("Masukkan Nama Karyawan: ");
       String namaKaryawan = scanner.nextLine();
       
       // Input Golongan
       System.out.println("Masukkan Golongan (1-5): ");
       int golonganInput = scanner.nextInt();
       
       // Variabel untuk jabatan dan gaji poko
       String jabatan = "";
       double gajiPokok = 0.0;
       
       // Menentukan jabatan dan gaji poko berdasarkan golongan dengan IF-ELSE
       if (golonganInput == 1) {
            jabatan = "Assisten Staff";
            gajiPokok = 3000000;
        } else if (golonganInput == 2) {
            jabatan = "Staff";
            gajiPokok = 3500000;
        } else if (golonganInput == 3) {
            jabatan = "Supervisor";
            gajiPokok = 4000000;
        } else if (golonganInput == 4) {
            jabatan = "Assisten Manager";
            gajiPokok = 5000000;
        } else if (golonganInput == 5) {
            jabatan = "Manager";
            gajiPokok = 6000000;
        } else {
            System.out.println("Golongan tidak valid. Menggunakan default (Golongan 1).");
            jabatan = "Assisten Staff";
            gajiPokok = 3000000;
        }
       
       // Membuat objek karyawan dengan parameter konstruktor
       Karyawan karyawan = new Karyawan(idKaryawan,  namaKaryawan, String.valueOf(golonganInput), jabatan, gajiPokok);
       
       // Menampilkan informasi karyawan
       karyawan.tampilkanInfo();
       
       // Menutup scanner
       scanner.close();
    }
}
