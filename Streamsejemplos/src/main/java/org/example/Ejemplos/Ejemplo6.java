package org.example.Ejemplos;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ejemplo6 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("manzana", "pera", "uva");

        Optional<String> resultado = palabras.stream()
                .filter(palabra -> palabra.startsWith("m"))
                .findFirst();

        resultado.ifPresent(System.out::println);
    }
}
