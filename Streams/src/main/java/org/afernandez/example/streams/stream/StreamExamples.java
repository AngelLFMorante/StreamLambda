package org.afernandez.example.streams.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que demuestra el uso de Streams en Java 8+ para manipular listas de datos.
 */
public class StreamExamples {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "Ana", "Pedro", "Lucas", "Maria");

        // 1. Filtrar nombres que comiencen con "P"
        List<String> nombresConP = nombres.stream()
                .filter(nombre -> nombre.startsWith("P")) // Filtra nombres que comienzan con "P"
                .collect(Collectors.toList());

        System.out.println("Nombres que comienzan con P: " + nombresConP); // Output: [Pedro]

        // 2. Convertir nombres a mayúsculas
        List<String> nombresEnMayusculas = nombres.stream()
                .map(String::toUpperCase) // Convierte cada nombre a mayúsculas
                .collect(Collectors.toList());

        System.out.println("Nombres en mayúsculas: " + nombresEnMayusculas);

        // 3. Contar nombres que tengan más de 3 letras
        long cantidadNombresLargos = nombres.stream()
                .filter(nombre -> nombre.length() > 3) // Filtra nombres con más de 3 letras
                .count();

        System.out.println("Cantidad de nombres con más de 3 letras: " + cantidadNombresLargos); // Output: 3
    }
}
