package edu.arseniumgx.collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> catalogoLivros;

  public CatalogoLivros() {
    this.catalogoLivros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int ano) {
    catalogoLivros.add(new Livro(titulo, autor, ano));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();

    if(!catalogoLivros.isEmpty()) {
      for(Livro l : catalogoLivros) {
        if(l.getAutor().equalsIgnoreCase(autor)){
          livrosPorAutor.add(l);
        }
      }
    }

    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal) {
    List<Livro> livros = new ArrayList<>();

    if(!catalogoLivros.isEmpty()){
      for (Livro l : catalogoLivros) {
        if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livros.add(l);
        }
      }
    }

    return livros;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livro = null;

    if(!catalogoLivros.isEmpty()) {
      for (Livro l : catalogoLivros) {
        if(l.getTitulo().equalsIgnoreCase(titulo)) {
          livro = l;
          break;
        }
      }
    }

    return livro;
  }

  @Override
  public String toString() {
    return "CatalogoLivros{" +
            "catalogoLivros=" + catalogoLivros +
            '}';
  }

  public static void main(String[] args) {
    CatalogoLivros catalogo = new CatalogoLivros();

    catalogo.adicionarLivro("Livro 1", "Autor 1", 2019);
    catalogo.adicionarLivro("Livro 2", "Autor 1", 2020);
    catalogo.adicionarLivro("Livro 6", "Autor 2", 2023);
    catalogo.adicionarLivro("Livro 5", "Autor 3", 2021);
    catalogo.adicionarLivro("Livro 1", "Autor 4", 2022);

    System.out.println(catalogo.pesquisarPorAutor("Autor 1"));
    System.out.println(catalogo.pesquisarPorIntervaloDeAno(2020, 2022));
    System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));

  }
}
