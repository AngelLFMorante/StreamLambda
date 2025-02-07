package com.example.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExamples {

    public static void main(String[] args) {
        // 1. Expresión lambda simple (suma de dos números)
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Suma: " + sum.apply(5, 3)); // Output: 8

        // 2. Lambda con Predicate (comprueba si un número es par)
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("¿Es 4 par?: " + isEven.test(4)); // Output: true

        // 3. Lambda con Function (convierte String a mayúsculas)
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.apply("java")); // Output: JAVA

        // 4. Lambda con Consumer (imprime un mensaje)
        Consumer<String> printMessage = message -> System.out.println("Mensaje: " + message);
        printMessage.accept("Hola desde una lambda!"); // Output: Mensaje: Hola desde una lambda!
    }
}
