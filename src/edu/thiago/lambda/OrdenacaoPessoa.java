package edu.thiago.lambda;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, double altura) {
        pessoasList.add(new Pessoa(nome, altura));
    }

    public List<Pessoa> ordenarPorAltura() {
        if (!pessoasList.isEmpty()) {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
            pessoasPorAltura.sort((pessoa1, pessoa2) -> Double.compare(pessoa1.getAltura(), pessoa2.getAltura()));
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("Lista vazia!");
        }

    }

    public static void main(String[] args) {
        OrdenacaoPessoa rankingAltura = new OrdenacaoPessoa();
        rankingAltura.adicionarPessoa("João", 1.5);
        rankingAltura.adicionarPessoa("Pedro", 2.0);
        rankingAltura.adicionarPessoa("Maria", 1.6);
        System.out.println(rankingAltura.ordenarPorAltura());
    }

}

