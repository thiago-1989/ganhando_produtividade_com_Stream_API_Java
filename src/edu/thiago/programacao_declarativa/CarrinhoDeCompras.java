package edu.thiago.programacao_declarativa;

import edu.thiago.programacao_imperativa.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtosLista;

    public CarrinhoDeCompras(){
        this.produtosLista = new ArrayList<Produto>();
    }

    public void adicionaProduto(String nome, int quantidade, double preco){
        Produto produto = new Produto(nome, quantidade, preco);
        this.produtosLista.add(produto);
    }

    public double calcularValorTotal() {
        double totalProdutos = 0;
        if (this.produtosLista.isEmpty()) {
            throw new RuntimeException("Lista vazia!");
        }
        return this.produtosLista.stream().mapToDouble(produto -> produto.getPreco() * produto.getQuantidade()).sum();
    }

    public static void main(String[] args) {
        edu.thiago.programacao_imperativa.CarrinhoDeCompras carrinho = new edu.thiago.programacao_imperativa.CarrinhoDeCompras();
        carrinho.adicionarProduto("Notebook", 28, 8500.00);
        System.out.printf("R$%.2f", carrinho.calcularValorTotal());
    }
}
