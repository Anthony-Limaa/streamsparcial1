package org.example.Ejemplos;
import java.util.Arrays;

public class Ejemplo8 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        long cantidad = Arrays.stream(numeros)
                .count();

        System.out.println("La cantidad de números es: " + cantidad);
    }
}
