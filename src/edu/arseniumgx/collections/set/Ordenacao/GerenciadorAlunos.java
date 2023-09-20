package edu.arseniumgx.collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private final Set<Aluno> alunoSet;

  public GerenciadorAlunos() {
    this.alunoSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, long matricula, double media) {
    alunoSet.add(new Aluno(matricula, nome, media));
  }

  public void removerAluno(long matricula) {
    if (!alunoSet.isEmpty()) {
      alunoSet.removeIf(a -> a.getMatricula() == matricula);
    }
  }

  public void exibirAlunosPorNome() {
    System.out.println(new TreeSet<>(alunoSet));
  }

  public void exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunoNota());
    alunosPorNota.addAll(alunoSet);
    System.out.println(alunosPorNota);
  }

  public void exibirAlunos() {
    System.out.println(alunoSet);
  }

  public static void main(String[] args) {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    gerenciadorAlunos.adicionarAluno("Fulano de Tal", 123456, 7.6);
    gerenciadorAlunos.adicionarAluno("Jon Doe", 124253, 4.5);
    gerenciadorAlunos.adicionarAluno("Maria de Quem", 57384, 9.9);
    gerenciadorAlunos.adicionarAluno("Joana D'Arc", 746492, 6.4);
    gerenciadorAlunos.adicionarAluno("Aluno Fake", 2746493, 6.4);

    gerenciadorAlunos.exibirAlunos();

    gerenciadorAlunos.removerAluno(57384);
    gerenciadorAlunos.exibirAlunos();

    gerenciadorAlunos.exibirAlunosPorNome();
    gerenciadorAlunos.exibirAlunosPorNota();
  }
}
