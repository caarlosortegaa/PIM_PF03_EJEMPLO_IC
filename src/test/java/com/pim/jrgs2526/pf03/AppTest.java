package com.pim.jrgs2526.pf03;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @ParameterizedTest
    @ValueSource(ints ={5,6,7,8,9,10})
    public void testCalcularAprobado(int nota) {
        App main = new App();
        int resultado = main.calcularNota(nota);
        Assertions.assertEquals(1, resultado);
    }
    @ParameterizedTest
    @ValueSource(ints ={1,2,3,4})
    public void testCalcularSuspenso(int mark) {
        App main = new App();
        int resultado = main.calcularNota(mark);
        Assertions.assertEquals(-1, resultado);
    }
    @ParameterizedTest
    @ValueSource(ints ={19,-7,-2,25})
    public void testCalcularError() {
        App main = new App();
        try {
            int resultado = main.calcularNota(63);
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Error al calcular nota", e.getMessage());
            return;
        }
        Assertions.fail();
    }
}
