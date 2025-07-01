package com.ejemplo;

public class Calculadora {

    // Suma dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Resta dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Multiplica dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Divide dos números (maneja división por cero)
    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("¡No se puede dividir por cero!");
        }
        return (double) a / b;
    }
}