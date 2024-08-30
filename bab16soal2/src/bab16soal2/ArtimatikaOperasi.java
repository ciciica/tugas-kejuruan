/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab16soal2;

/**
 *
 * @author LENOVO
 */
public class ArtimatikaOperasi {
    protected double a;
    protected double b;

    // Konstruktor untuk menginisialisasi bilangan
    public ArtimatikaOperasi(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    protected abstract double performOperation();
}
class Addition extends ArtimatikaOperasi {

    public Addition(double a, double b) {
        super(a, b);
    }

    @Override
    protected double performOperation() {
        return a + b;
    }
}
class Subtraction extends ArtimatikaOperasi {

    public Subtraction(double a, double b) {
        super(a, b);
    }

    @Override
    protected double performOperation() {
        return a - b;
    }
}
class Multiplication extends ArtimatikaOperasi {

    public Multiplication(double a, double b) {
        super(a, b);
    }

    @Override
    protected double performOperation() {
        return a * b;
    }
}
class Division extends ArtimatikaOperasi {

    public Division(double a, double b) {
        super(a, b);
    }

    @Override
    protected double performOperation() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }
}
