package edu.arseniumgx.collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private final Map<Long, Produto> estoqueProdutoMap;

  public EstoqueProdutos() {
    this.estoqueProdutoMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos() {
    if(!estoqueProdutoMap.isEmpty()) {
      System.out.println(estoqueProdutoMap);
    }
  }

  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0d;
    if (!estoqueProdutoMap.isEmpty()) {
      for (Produto p : estoqueProdutoMap.values()) valorTotalEstoque += p.getQuantidade() * p.getPreco();
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;

    if(!estoqueProdutoMap.isEmpty()) {
      for (Produto p : estoqueProdutoMap.values()) {
        if (p.getPreco() > maiorPreco) {
          produtoMaisCaro = p;
          maiorPreco = p.getPreco();
        }
      }
    }

    return  produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;

    if(!estoqueProdutoMap.isEmpty()) {
      for (Produto p : estoqueProdutoMap.values())
        if (p.getPreco() < menorPreco) {
          produtoMaisBarato = p;
          menorPreco = p.getPreco();
        }
    }

    return  produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorQuantidadeValorTotal = null;
    double valorTotalEstoque = Double.MIN_VALUE;
    double valorEstoque = 0d;

    if (!estoqueProdutoMap.isEmpty()) {
      for (Produto p : estoqueProdutoMap.values()) {
        valorEstoque = p.getPreco() * p.getQuantidade();
        if (valorEstoque > valorTotalEstoque) {
          produtoMaiorQuantidadeValorTotal = p;
          valorTotalEstoque = valorEstoque;
        }
      }
    }
    return produtoMaiorQuantidadeValorTotal;
  }

  public static void main(String[] args) {
    EstoqueProdutos produtos = new EstoqueProdutos();

    produtos.adicionarProduto(1L, "Produto 1", 10, 5.0);
    produtos.adicionarProduto(2L, "Produto 2", 14, 12.3);
    produtos.adicionarProduto(3L, "Produto 3", 8, 32.1);
    produtos.adicionarProduto(4L, "Produto 4", 5, 2.4);

    produtos.exibirProdutos();

    System.out.println("Valor total do estoque: R$ " + produtos.calcularValorTotalEstoque());
    System.out.println("Produto mais caro: " + produtos.obterProdutoMaisCaro());
    System.out.println("Produto mais bataro: " + produtos.obterProdutoMaisBarato());
    System.out.println("Produto com maior valor total de estoque: " + produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

  }
}
