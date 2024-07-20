package edu.thiago.functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        // Supplier com expressão Lambda fornecendo saudação personalizada
        Supplier<String> saudacao = () -> "Olá, sejam bem-vindos!";

        // Usar supplier para obter 5 saudações
        List<String> listaSaudacoes = Stream.generate((saudacao)).limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
