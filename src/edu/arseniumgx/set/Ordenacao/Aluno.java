package edu.arseniumgx.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
  private final long matricula;
  private final String nome;
  private final double media;

  public Aluno(long matricula, String nome, double media) {
    this.matricula = matricula;
    this.nome = nome;
    this.media = media;
  }

  public long getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public double getMedia() {
    return media;
  }

  @Override
  public String toString() {
    return "{" +
            "matricula=" + matricula +
            ", nome='" + nome + '\'' +
            ", media=" + media +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Aluno aluno)) return false;
    return getMatricula() == aluno.getMatricula() && Objects.equals(getNome(), aluno.getNome());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getMatricula(), getNome());
  }

  @Override
  public int compareTo(Aluno a) {
    return getNome().compareToIgnoreCase(a.getNome());
  }
}

class ComparatorAlunoNota implements Comparator<Aluno> {
  @Override
  public int compare(Aluno a1, Aluno a2) {
    return Double.compare(a1.getMedia(), a2.getMedia());
  }
}