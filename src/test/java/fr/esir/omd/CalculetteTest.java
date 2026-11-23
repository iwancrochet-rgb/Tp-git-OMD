package fr.esir.omd;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculetteTest {

    @Test
    public void testOperationsDeBase() {
        Calculette calc = new Calculette();
        assertEquals(5.0, calc.calculer(2.0, 3.0, '+'), 1e-9);
        assertEquals(1.0, calc.calculer(4.0, 3.0, '-'), 1e-9);
        assertEquals(12.0, calc.calculer(4.0, 3.0, '*'), 1e-9);
        assertEquals(2.5, calc.calculer(5.0, 2.0, '/'), 1e-9);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionParZero() {
        Calculette calc = new Calculette();
        calc.calculer(10.0, 0.0, '/');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperateurInvalide() {
        Calculette calc = new Calculette();
        calc.calculer(10.0, 2.0, '%');
    }
}

