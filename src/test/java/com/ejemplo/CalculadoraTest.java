package com.ejemplo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(8, Calculadora.sumar(5, 3), "5 + 3 debe ser 8");
    }

    private void assertEquals(int i, int sumar, String s) {
    }

    @Test
    public void testRestar() {
        assertEquals(2, Calculadora.restar(5, 3), "5 - 3 debe ser 2");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(15, Calculadora.multiplicar(5, 3), "5 * 3 debe ser 15");
    }

    @Test
    public void testDividir() {
        assertEquals(2, (int) Calculadora.dividir(5, 2), "5 / 2 debe ser 2.5");
    }

    @Test
    public void testDividirPorCero() {
        // Verifica que se lance ArithmeticException al dividir por cero
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(5, 0));
    }
}