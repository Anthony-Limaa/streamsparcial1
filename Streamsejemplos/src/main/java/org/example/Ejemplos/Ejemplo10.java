package org.example.Ejemplos;
import java.util.Arrays;

public class Ejemplo10 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        double suma = Arrays.stream(numeros)
                .sum();

        double promedio = Arrays.stream(numeros)
                .average()
                .orElse(0); // En caso de que la lista esté vacía, se retorna 0 como valor predeterminado

        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
    }

}
