package edu.arseniumgx.set.OperaceosBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidados;

  public ConjuntoConvidados() {
    this.convidados = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int cdConvite) {
    convidados.add(new Convidado(nome, cdConvite));
  }

  public void removerConvidadoPorCdConvite(int cdConvidado) {
    Convidado convidadoParaRemover = null;
    if(!convidados.isEmpty()) {
      for(Convidado c: convidados) {
        if(c.getCdConvite() == cdConvidado) {
          convidadoParaRemover = c;
          break;
        }
      }

      convidados.remove(convidadoParaRemover);
    }
  }

  public int contarConvidados() {
    return convidados.size();
  }

  public void exibirConvidados() {
    System.out.println(convidados);
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
    conjuntoConvidados.adicionarConvidado("Convidado 2", 1);
    conjuntoConvidados.adicionarConvidado("Convidado 3", 3);
    conjuntoConvidados.adicionarConvidado("Convidado 4", 4);

    conjuntoConvidados.removerConvidadoPorCdConvite(4);
    conjuntoConvidados.exibirConvidados();
    System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidados");
  }

}
