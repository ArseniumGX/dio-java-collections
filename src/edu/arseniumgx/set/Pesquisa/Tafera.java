package edu.arseniumgx.set.Pesquisa;

import java.util.Objects;

public class Tafera {

  private String descricao;
  private boolean concluida;

  public Tafera(String descricao) {
    this.descricao = descricao;
    this.concluida = false;
  }

  public String getDescricao() {
    return descricao;
  }

  public boolean isConcluida() {
    return concluida;
  }

  public void setConcluida(boolean concluida) {
    this.concluida = concluida;
  }

  @Override
  public String toString() {
    return "{" +
            "descricao: \"" + descricao + '"' +
            ", concluida: " + concluida +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Tafera tafera)) return false;
    return Objects.equals(getDescricao(), tafera.getDescricao());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getDescricao());
  }
}
