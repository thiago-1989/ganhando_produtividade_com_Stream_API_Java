package edu.thiago.method_reference;

import edu.thiago.lambda.Pessoa;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, double altura) {
        Pessoa pessoa = new Pessoa(nome, altura);
        this.pessoasList.add(pessoa);
    }

    public List<Pessoa> ordenarPorAltura() {
        if (!pessoasList.isEmpty()) {
            List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoasList);
            pessoasOrdenadas.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoasOrdenadas;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public static void main(String[] args) {
        edu.thiago.lambda.OrdenacaoPessoa rankingAltura = new edu.thiago.lambda.OrdenacaoPessoa();
        rankingAltura.adicionarPessoa("João", 1.5);
        rankingAltura.adicionarPessoa("Pedro", 2.0);
        rankingAltura.adicionarPessoa("Maria", 1.6);
        System.out.println(rankingAltura.ordenarPorAltura());
    }

}
