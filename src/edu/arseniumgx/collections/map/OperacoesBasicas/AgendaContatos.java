package edu.arseniumgx.collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if(!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome) {
    return !agendaContatoMap.isEmpty()
            ? agendaContatoMap.get(nome)
            : null;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Contato 1", 123445);
    agendaContatos.adicionarContato("Contato 3", 324712);
    agendaContatos.adicionarContato("Contato 2", 485632);
    agendaContatos.adicionarContato("Contato 5", 384723);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Contato 2"));

    agendaContatos.removerContato("Contato 2");
    agendaContatos.exibirContatos();
  }
}
