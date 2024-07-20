package edu.thiago.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
    public static void main(String[] args) {
        // Lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Consumer com expressão LAMBDA para imprimir números pares
        Consumer<Integer> imprimirPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // usar CONSUMER para imprimir números pares no STREAM
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
