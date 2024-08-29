/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab13soal2;

/**
 *
 * @author LENOVO
 */
public class Segitiga {
    // Kelas Segitiga sebagai parent class
    protected double alas;
    protected double tinggi;

    // Constructor untuk inisialisasi alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return (alas * tinggi) / 2.0;
    }
}

// Kelas SegitigaLuas sebagai child class
class SegitigaLuas extends Segitiga {
    public SegitigaLuas(double alas, double tinggi) {
        super(alas, tinggi);
    }

    // Overriding method hitungLuas
    @Override
    public double hitungLuas() {
        return (alas * tinggi) / 2.0;
    }
}
