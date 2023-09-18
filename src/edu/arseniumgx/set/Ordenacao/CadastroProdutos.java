package edu.arseniumgx.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  private final Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto (long cod, String nome, double preco, int quantidade) {
    produtoSet.add(new Produto(cod, nome, preco, quantidade));
  }

  public Set<Produto> exibirPodutosPorNome() {
    return new TreeSet<>(produtoSet);
  }

  public Set<Produto> exibirProdutoPorPreco() {
    Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtoPorPreco.addAll(produtoSet);
    return produtoPorPreco;
  }

  public static void main(String[] args) {
    CadastroProdutos produtos = new CadastroProdutos();

    produtos.adicionarProduto(1, "Produto 1", 12.23, 3);
    produtos.adicionarProduto(2, "Produto 5", 23.34, 4);
    produtos.adicionarProduto(3, "Produto 3", 56.78, 64);
    produtos.adicionarProduto(4, "Produto 4", 34.32, 7);

    System.out.println(produtos.produtoSet);
    System.out.println(produtos.exibirPodutosPorNome());
    System.out.println(produtos.exibirProdutoPorPreco());
  }
}
