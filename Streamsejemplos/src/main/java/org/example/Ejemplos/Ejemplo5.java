package org.example.Ejemplos;
import java.util.Arrays;

public class Ejemplo5 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int suma = Arrays.stream(numeros)
                .sum();

        System.out.println("La suma es: " + suma);
    }

}
