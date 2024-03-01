package org.example.Ejemplos;
import java.util.Arrays;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Hola", "qué", "tal", "estás");

        String resultado = palabras.stream()
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(resultado.trim());
    }
}
