package org.example.Ejemplos;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo4 {

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("zanahoria", "manzana", "pera", "uva");

        List<String> palabrasOrdenadas = palabras.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(palabrasOrdenadas);
    }

}
