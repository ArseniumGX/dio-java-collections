package edu.arseniumgx.set.OperaceosBasicas;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas{

  private Set<String> palavras;

  public ConjuntoPalavrasUnicas() {
    this.palavras = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    this.palavras.add(palavra);
  }

  public void removerPalavra(String palavra) {
    String palavraRemover = null;

    if(!palavras.isEmpty()) {
      for (String p : palavras) {
        if(p.equals(palavra)) {
          palavraRemover = p;
          break;
        }
      }
    }

    palavras.remove(palavraRemover);
  }

  public void exibirPalavrasUnicas() {
    System.out.println(this.palavras);
  }

  public void verificarPalavra(String palavra) {
    boolean palavraExiste = false;

    if(!palavras.isEmpty()) {
      for (String p : palavras) {
        if(p.equals(palavra)) {
          palavraExiste = true;
          break;
        }
      }
    }

    if(palavraExiste)
      System.out.printf("A palavra %s já existe no set.\n", palavra);
    else
      System.out.printf("A palavra %s não existe no set.\n", palavra);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
    return Objects.equals(palavras, that.palavras);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palavras);
  }

  @Override
  public String toString() {
    return "{" +
            "palavras=" + palavras +
            '}';
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

    conjuntoPalavrasUnicas.adicionarPalavra("Sim");
    conjuntoPalavrasUnicas.adicionarPalavra("Palavra");
    conjuntoPalavrasUnicas.adicionarPalavra("Novo");
    conjuntoPalavrasUnicas.adicionarPalavra("Sim");
    conjuntoPalavrasUnicas.adicionarPalavra("Cabeça");

    conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    conjuntoPalavrasUnicas.verificarPalavra("VaDas");
    conjuntoPalavrasUnicas.verificarPalavra("Novo");

    conjuntoPalavrasUnicas.removerPalavra("Palavra");

    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
  }
}
