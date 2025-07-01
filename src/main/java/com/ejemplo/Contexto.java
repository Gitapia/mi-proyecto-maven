package com.ejemplo;

import java.util.Scanner;

public class Contexto {
    private static final Scanner scanner = new Scanner(System.in);

    public static void ejecutarCalculadora() {
        System.out.println("=== Calculadora en Consola ===");

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Operación (+, -, *, /): ");
        String operacion = scanner.next();

        double resultado = 0;
        switch (operacion) {
            case "+":
                resultado = Calculadora.sumar(num1, num2);
                break;
            case "-":
                resultado = Calculadora.restar(num1, num2);
                break;
            case "*":
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case "/":
                resultado = Calculadora.dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}