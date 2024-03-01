package org.example.Ejemplos;
import java.util.Arrays;

public class Ejemplo9 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        boolean hayPares = Arrays.stream(numeros)
                .anyMatch(num -> num % 2 == 0);

        if (hayPares) {
            System.out.println("Hay números pares en la lista.");
        } else {
            System.out.println("No hay números pares en la lista.");
        }
    }
}
