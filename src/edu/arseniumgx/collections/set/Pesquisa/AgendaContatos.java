package edu.arseniumgx.collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatos;

  public AgendaContatos() {
    this.contatos = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatos.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(contatos);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();

    if(!contatos.isEmpty()) {
      for (Contato c : contatos) {
        if (c.getNome().startsWith(nome)) {
          contatosPorNome.add(c);
        }
      }
    }

    return contatosPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int numero) {
    Contato contatoAtualizado = null;

    if (!contatos.isEmpty()) {
      for (Contato c : contatos) {
        if(c.getNome().equalsIgnoreCase(nome)){
          c.setNumero(numero);
          contatoAtualizado = c;
          break;
        }
      }
    }

    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("José Macedo", 123452);
    agendaContatos.adicionarContato("José", 1234522);
    agendaContatos.adicionarContato("Arseniumgx", 63527);
    agendaContatos.adicionarContato("Day", 19636);

    agendaContatos.exibirContatos();
    System.out.println(agendaContatos.pesquisarPorNome("José"));

    agendaContatos.atualizarNumeroContato("Day", 87654);
    agendaContatos.exibirContatos();
  }
}
