package edu.thiago.lambda;

public class Pessoa {

    private String nome;
    private double altura;

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                '}';
    }

}
