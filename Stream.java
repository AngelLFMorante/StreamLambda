package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "Ana", "Pedro", "Lucas", "Maria");

        // 1. Filtrar nombres que comiencen con "P"
        List<String> nombresConP = nombres.stream()
                .filter(nombre -> nombre.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println("Nombres que comienzan con P: " + nombresConP); // Output: [Pedro]

        // 2. Convertir nombres a mayúsculas
        List<String> nombresEnMayusculas = nombres.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Nombres en mayúsculas: " + nombresEnMayusculas);

        // 3. Contar nombres que tengan más de 3 letras
        long count = nombres.stream()
                .filter(nombre -> nombre.length() > 3)
                .count();

        System.out.println("Nombres con más de 3 letras: " + count); // Output: 3
    }
}
