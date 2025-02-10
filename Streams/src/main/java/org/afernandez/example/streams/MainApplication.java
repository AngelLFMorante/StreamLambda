package org.afernandez.example.streams;


import org.afernandez.example.streams.lambda.LambdaExamples;
import org.afernandez.example.streams.stream.StreamExamples;

/**
 * Clase principal que ejecuta los ejemplos de Streams y Lambdas.
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("=== Ejemplos de Lambdas ===");
        LambdaExamples.main(args);

        System.out.println("\n=== Ejemplos de Streams ===");
        StreamExamples.main(args);
    }
}
