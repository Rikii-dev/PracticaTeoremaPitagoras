package tests;

import clases.TrianguloRectangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testTrianguloRectangulo {

    @Test
    public void testHipotenusaPorDefecto() {
        TrianguloRectangulo t = new TrianguloRectangulo();
        double esperado = Math.sqrt(2);
        assertEquals(esperado, t.hipotenusa());
    }

    @Test
    public void testAreaPorDefecto() {
        TrianguloRectangulo t = new TrianguloRectangulo();
        assertEquals(0.5, t.area());
    }

    @Test
    public void testPerimetroPorDefecto() {
        TrianguloRectangulo t = new TrianguloRectangulo();
        double esperado = 1 + 1 + Math.sqrt(2);
        assertEquals(esperado, t.perimetro());
    }

    @Test
    public void testHipotenusaValida() {
        TrianguloRectangulo t = new TrianguloRectangulo(3, 4);
        assertEquals(5.0, t.hipotenusa());
    }

    @Test
    public void testAreaValida() {
        TrianguloRectangulo t = new TrianguloRectangulo(3, 4);
        assertEquals(6.0, t.area());
    }

    @Test
    public void testPerimetroValido() {
        TrianguloRectangulo t = new TrianguloRectangulo(3, 4);
        assertEquals(12.0, t.perimetro());
    }

    @Test
    public void testTrianguloInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new TrianguloRectangulo(-2, 4);
        });
    }
}
