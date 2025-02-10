# Ejemplo de Uso de Streams y Lambdas en Java

## Descripción
Este proyecto demuestra el uso de **Java Streams** y **Lambdas** para manipular datos de manera eficiente.
Es un ejemplo útil para entrevistas técnicas que requieren conocimientos de **Java 8+**, en particular, **expresiones lambda y operaciones con streams**.

Incluye:
- **Uso de Streams** para filtrar, transformar y contar elementos de una lista.
- **Expresiones Lambda** aplicadas a funciones como `Predicate`, `Function`, `BiFunction` y `Consumer`.
- **Estructura simple y modular** con una clase principal (`MainApplication`) para ejecutar ambos ejemplos.

## Tecnologías Utilizadas
- **Java 8+** (necesario para usar Streams y Lambdas)
- **Maven** (para la gestión de dependencias y build del proyecto)

## Estructura del Proyecto
```
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.streams
│   │   │   │   ├── StreamExamples.java
│   │   │   ├── com.example.lambda
│   │   │   │   ├── LambdaExamples.java
│   │   │   ├── com.example
│   │   │   │   ├── MainApplication.java
│   ├── test
│   │   ├── (Pruebas opcionales)
│   ├── pom.xml (Configuración de Maven)
```

## Instalación y Ejecución
1. **Clonar el repositorio**
   ```sh
   git clone https://github.com/tu-repositorio/java-streams-lambdas.git
   cd java-streams-lambdas
   ```
2. **Compilar y ejecutar el proyecto**
   ```sh
   mvn clean package
   mvn exec:java -Dexec.mainClass="com.example.MainApplication"
   ```

## Explicación de los Ejemplos

### 1. Uso de Streams (`StreamExamples.java`)
#### Operaciones realizadas:
- **Filtrar nombres** que comiencen con "P"
- **Convertir nombres** a mayúsculas
- **Contar nombres** con más de 3 letras

```java
List<String> nombresConP = nombres.stream()
        .filter(nombre -> nombre.startsWith("P"))
        .collect(Collectors.toList());
```

### 2. Expresiones Lambda (`LambdaExamples.java`)
#### Operaciones realizadas:
- **`BiFunction`** para sumar dos números
- **`Predicate`** para verificar si un número es par
- **`Function`** para convertir una cadena a mayúsculas
- **`Consumer`** para imprimir mensajes

```java
BiFunction<Integer, Integer, Integer> suma = Integer::sum;
Predicate<Integer> esPar = num -> num % 2 == 0;
Function<String, String> convertirAMayusculas = String::toUpperCase;
Consumer<String> imprimirMensaje = mensaje -> System.out.println("Mensaje: " + mensaje);
```

## Posibles Preguntas en Entrevistas Técnicas
1. **¿Qué es una expresión lambda en Java?**

    Una expresión lambda en Java es una forma de representar una función o un bloque de código que puede ser pasado como argumento a un método. Permite escribir implementaciones de interfaces funcionales de manera más concisa y legible.

2. **¿Cuál es la diferencia entre `map()` y `filter()` en Streams?**
   - **`map()`**: Se utiliza para transformar los elementos de un stream aplicando una función a cada uno de ellos y devolviendo un nuevo stream con los resultados transformados.
   - **`filter()`**: Se utiliza para filtrar los elementos de un stream, devolviendo un nuevo stream que solo contiene los elementos que cumplen con una condición específica.
3. **¿Cómo funciona `Collectors.toList()`?**

   Es un collector que se utiliza en una operación de terminal de un stream para acumular los elementos del stream en una lista. Devuelve un `List<T>` que contiene todos los elementos procesados por el stream.

4. **¿Cuál es la diferencia entre `Predicate`, `Function` y `Consumer`?**

   - **`Predicate<T>`**: Representa una función que toma un argumento de tipo `T` y devuelve un valor booleano. Se usa generalmente para filtrado.
   - **`Function<T, R>`**: Representa una función que toma un argumento de tipo `T` y devuelve un resultado de tipo `R`. Se usa para transformar datos.
   - **`Consumer<T>`**: Representa una operación que toma un argumento de tipo `T` y no devuelve ningún resultado. Se usa para realizar acciones como imprimir o modificar objetos.
   
5. **¿Cuándo usar `parallelStream()` en lugar de `stream()`?**
    Se usa cuando se desea procesar los elementos de un stream en paralelo para aprovechar varios núcleos del procesador. Es útil para operaciones costosas computacionalmente en conjuntos de datos grandes. Se debe evitar cuando el costo de gestionar los hilos en paralelo es mayor que los beneficios.


## Contribución
Si encuentras mejoras o quieres aportar, envía un **Pull Request** o abre un **Issue** en el repositorio.

## Licencia
Este proyecto es de código abierto y está disponible bajo la licencia MIT.

