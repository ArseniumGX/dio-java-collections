package edu.arseniumgx.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);

    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

    return  pessoasPorAltura;
  }

  @Override
  public String toString() {
    return "OrdenacaoPessoa{" +
            "pessoaList=" + pessoaList +
            '}';
  }

  public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

    ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
    ordenacaoPessoa.adicionarPessoa("Nome 2", 18, 1.76);
    ordenacaoPessoa.adicionarPessoa("Nome 3", 28, 1.89);
    ordenacaoPessoa.adicionarPessoa("Nome 4", 32, 1.72);
    ordenacaoPessoa.adicionarPessoa("Nome 5", 40, 1.68);

    System.out.println(ordenacaoPessoa);
    System.out.println(ordenacaoPessoa.ordenarPorIdade());
    System.out.println(ordenacaoPessoa.ordenarPorAltura());
  }
}
