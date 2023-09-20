package edu.arseniumgx.collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private final Map<String, Integer> contagemPalavraMap;

  public ContagemPalavras() {
    this.contagemPalavraMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem) {
    contagemPalavraMap.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    contagemPalavraMap.remove(palavra);
  }

  public void exibirContagemPalavras() {
    System.out.println(contagemPalavraMap);
  }

  public String encontrarpalavraMaisFrequente() {
    int maiorFrequencia = Integer.MIN_VALUE;
    String palavraMaisFrequente = null;

    if(!contagemPalavraMap.isEmpty()) {
      for (Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()){
        if (entry.getValue() > maiorFrequencia) {
          maiorFrequencia = entry.getValue();
          palavraMaisFrequente = entry.getKey();
        }
      }
    }

    return palavraMaisFrequente + " com " + maiorFrequencia + " ocorrencias";
  }

  public static void main(String[] args) {
    ContagemPalavras palavras = new ContagemPalavras();

    palavras.adicionarPalavra("Sim", 6);
    palavras.adicionarPalavra("Cabeça", 2);
    palavras.adicionarPalavra("Céu", 40);
    palavras.adicionarPalavra("Pão", 12);

    palavras.exibirContagemPalavras();

    palavras.removerPalavra("Cabeça");
    palavras.exibirContagemPalavras();

    System.out.println("Palavra com maior frequencia: " + palavras.encontrarpalavraMaisFrequente());
  }
}
