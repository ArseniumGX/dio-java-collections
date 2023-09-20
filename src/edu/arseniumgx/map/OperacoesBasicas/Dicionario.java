package edu.arseniumgx.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private final Map<String, String> dicionarioMap;

  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionarioMap.put(palavra, definicao);
  }
  public void removerPalavra(String palavra) {
    if(!dicionarioMap.isEmpty()){
      dicionarioMap.remove(palavra);
    }
  }
  public void exibirPalavras() {
    System.out.println(dicionarioMap);
  }
  public String pesquisarPorPalavra(String palavra){
    return !dicionarioMap.isEmpty()
            ? dicionarioMap.get(palavra) : null;
  }

  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();


    dicionario.adicionarPalavra("Cadeira", "Lugar para sentar");
    dicionario.adicionarPalavra("Mesa", "Lugar para por coisas");
    dicionario.adicionarPalavra("Geladeira", "Equipamento eletronicio para armazenar alimentos");
    dicionario.adicionarPalavra("Oculos", "Objeto estético ou para corrigir problema de vista");

    dicionario.exibirPalavras();

    System.out.println(dicionario.pesquisarPorPalavra("Mesa"));

    dicionario.removerPalavra("Geladeira");
    dicionario.exibirPalavras();
  }
}
