package edu.thiago.programacao_imperativa;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private List<Produto> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
       Produto item = new Produto(nome, quantidade, preco);
        this.itemList.add(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Produto item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
        throw new RuntimeException("Lista vazia");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto("Notebook", 28, 8500.00);
        System.out.printf("R$ %.2f", carrinho.calcularValorTotal());
    }
}
