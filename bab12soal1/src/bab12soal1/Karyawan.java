/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab12soal1;

/**
 *
 * @author LENOVO
 */
public class Karyawan {
    String nama;
    double gaji;

public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
}

class SystemAnalyst extends Karyawan {
    double bonus;
    double tunjanganMakan;
    double transport;

    public SystemAnalyst(String nama, double gaji, double bonus, double tunjanganMakan, double transport) {
        super(nama, gaji);
        this.bonus = bonus;
        this.tunjanganMakan = tunjanganMakan;
        this.transport = transport;
    }
        public double hitungGajiTotal() {
        double gajiTotal = gaji + bonus + tunjanganMakan + transport;
        return gajiTotal;
    }
}
