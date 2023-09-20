package edu.arseniumgx.collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> itemCarrinho;

  public CarrinhoDeCompras() {
    this.itemCarrinho = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    Item item = new Item(nome, preco, quantidade);
    itemCarrinho.add(item);
  }

  public void removerItem(String nome) {
    List<Item> listaItemRemover = new ArrayList<>();

    for(Item i : itemCarrinho) {
      if(i.getNome().equalsIgnoreCase(nome)) {
        listaItemRemover.add(i);
      }
    }

    itemCarrinho.removeAll(listaItemRemover);
  }

  public String calcularValorTotal() {
    double valorTotal = 0;

    for (Item i : itemCarrinho) {
      valorTotal += i.getPreco() * i.getQuantidade();
    }

    return "Valor total do carrinho: " + valorTotal;
  }

  public void exibirItens() {
    System.out.println(itemCarrinho);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarItem("Miojo", 2.15, 5);
    carrinho.adicionarItem("Miojo", 2.15, 5);
    carrinho.adicionarItem("Sabonete", 0.89, 10);
    carrinho.adicionarItem("Abacaxi", 5.70, 2);

    carrinho.removerItem("Miojo");

    System.out.println(carrinho.calcularValorTotal());


    carrinho.exibirItens();
  }
}
