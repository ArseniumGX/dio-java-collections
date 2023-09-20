package edu.arseniumgx.collections.set.OperaceosBasicas;

import java.util.Objects;

public class Convidado {
  private String nome;
  private int cdConvite;

  public Convidado(String nome, int cdConvite) {
    this.nome = nome;
    this.cdConvite = cdConvite;
  }

  public String getNome() {
    return nome;
  }

  public int getCdConvite() {
    return cdConvite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Convidado convidado)) return false;
    return getCdConvite() == convidado.getCdConvite();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCdConvite());
  }

  @Override
  public String toString() {
    return "{" +
            "nome='" + nome + '\'' +
            ", cdConvite=" + cdConvite +
            '}';
  }
}
