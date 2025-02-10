package org.afernandez.example.streams.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Clase que muestra el uso de expresiones lambda en Java 8+.
 */
public class LambdaExamples {

    public static void main(String[] args) {
        // 1. Expresión lambda simple para sumar dos números
        BiFunction<Integer, Integer, Integer> suma = Integer::sum;
        System.out.println("Suma: " + suma.apply(5, 3)); // Output: 8

        // 2. Lambda con Predicate para comprobar si un número es par
        Predicate<Integer> esPar = num -> num % 2 == 0;
        System.out.println("¿Es 4 par?: " + esPar.test(4)); // Output: true

        // 3. Lambda con Function para convertir una cadena a mayúsculas
        Function<String, String> convertirAMayusculas = String::toUpperCase;
        System.out.println(convertirAMayusculas.apply("java")); // Output: JAVA

        // 4. Lambda con Consumer para imprimir un mensaje
        Consumer<String> imprimirMensaje = mensaje -> System.out.println("Mensaje: " + mensaje);
        imprimirMensaje.accept("¡Hola desde una lambda!"); // Output: Mensaje: ¡Hola desde una lambda!
    }
}
