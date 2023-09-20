package edu.arseniumgx.collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private final Set<Tafera> taferaSet;

  public ListaTarefas() {
    this.taferaSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    taferaSet.add(new Tafera(descricao));
  }

  public void removerTarefa(String descricao) {
    if(!taferaSet.isEmpty()) {
      for (Tafera t : taferaSet) {
        if(t.getDescricao().equalsIgnoreCase(descricao)) {
          taferaSet.remove(t);
          break;
        }
      }
    }
  }

  public void exibirTarefas() {
    System.out.println(taferaSet.toString());
  }

  public int contarTarefas() {
    return taferaSet.size();
  }

  public Set<Tafera> obterTarefasConcluidas() {
    Set<Tafera> tarefasConcluidas = new HashSet<>();

    if(!taferaSet.isEmpty()) {
      for(Tafera t : taferaSet) {
        if(t.isConcluida()) {
          tarefasConcluidas.add(t);
        }
      }
    }

    return tarefasConcluidas;
  }

  public Set<Tafera> obterTarefasPendentes() {
    Set<Tafera> tarefasPendentes = new HashSet<>();

    if(!taferaSet.isEmpty()) {
      for(Tafera t : taferaSet) {
        if(!t.isConcluida()) {
          tarefasPendentes.add(t);
        }
      }
    }

    return tarefasPendentes;
  }

  public void marcarTarefaConcluida(String descricao) {
    if (!taferaSet.isEmpty()) {
      for (Tafera t : taferaSet) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
          t.setConcluida(true);
          break;
        }
      }
    }
  }

  public void marcarTarefaPendente(String descricao) {
    if (!taferaSet.isEmpty()) {
      for (Tafera t : taferaSet) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
          t.setConcluida(false);
          break;
        }
      }
    }
  }

  public void limparListTarefas() {
    taferaSet.clear();
  }

  public static void main(String[] args) {
    ListaTarefas listaTarefa = new ListaTarefas();

    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");
    listaTarefa.adicionarTarefa("Tarefa 3");
    listaTarefa.adicionarTarefa("Tarefa 4");

    listaTarefa.exibirTarefas();
    System.out.printf("Há um total de %d tarefas.\n", listaTarefa.contarTarefas());

    listaTarefa.removerTarefa("aprender java");
    listaTarefa.exibirTarefas();

    System.out.printf("Há um total de %d tarefas.\n", listaTarefa.contarTarefas());

    listaTarefa.marcarTarefaConcluida("Tarefa 2");
    listaTarefa.marcarTarefaConcluida("Tarefa 3");

    System.out.println(listaTarefa.obterTarefasConcluidas());
    System.out.println(listaTarefa.obterTarefasPendentes());

    listaTarefa.marcarTarefaPendente("Tarefa 2");
    System.out.println(listaTarefa.obterTarefasConcluidas());
    System.out.println(listaTarefa.obterTarefasPendentes());

    listaTarefa.limparListTarefas();
    System.out.printf("Há um total de %d tarefas.\n",listaTarefa.contarTarefas());
    listaTarefa.exibirTarefas();
  }
}
