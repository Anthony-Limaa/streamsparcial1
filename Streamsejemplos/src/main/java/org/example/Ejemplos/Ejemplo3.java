package org.example.Ejemplos;
import java.util.stream.IntStream;

public class Ejemplo3 {

    public static void main(String[] args) {
        IntStream.range(1, 10)
                .forEach(System.out::println);
    }
}
