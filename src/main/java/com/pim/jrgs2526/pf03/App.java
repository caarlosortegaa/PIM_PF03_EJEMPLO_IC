package com.pim.jrgs2526.pf03;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

    }

    public int calcularNota(int nota) {
        if (nota >= 0 && nota <= 4)
            return -1;
        if (nota >= 5 && nota <= 10)
            return 1;
        throw new IllegalArgumentException("Error al calcular nota");
    }
}
