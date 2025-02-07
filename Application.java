package com.example;

import com.example.lambda.LambdaExamples;
import com.example.streams.StreamExamples;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("=== Ejemplos de Lambdas ===");
        LambdaExamples.main(args);

        System.out.println("\n=== Ejemplos de Streams ===");
        StreamExamples.main(args);
    }
}
