package org.example.Ejemplos;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Ejemplo7 {
    public static void main(String[] args) {
        List<List<Integer>> listaDeListas = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> numerosAplanados = listaDeListas.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(numerosAplanados);
    }
}
