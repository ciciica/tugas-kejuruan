/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab16soal1;

/**
 *
 * @author LENOVO
 */
public abstract class ArtimatikaOperasi {
    protected double a;  // Bilangan pertama
    protected double b;  // Bilangan kedua

    // Konstruktor untuk menginisialisasi bilangan
    public ArtimatikaOperasi(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Metode abstrak untuk operasi aritmatika
    protected abstract double add();
    protected abstract double subtract();
    protected abstract double multiply();
    protected abstract double divide();
}
class Operation extends ArtimatikaOperasi {

    // Konstruktor untuk menginisialisasi bilangan
    public Operation(double a, double b) {
        super(a, b);
    }

    @Override
    protected double add() {
        return a + b;
    }

    @Override
    protected double subtract() {
        return a - b;
    }

    @Override
    protected double multiply() {
        return a * b;
    }

    @Override
    protected double divide() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }
}
