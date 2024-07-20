package edu.thiago.functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numeros.stream().reduce(0, Integer::sum));  //resultado == 55

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream().reduce(0, somar);

        System.out.println(resultado);

    }

}
