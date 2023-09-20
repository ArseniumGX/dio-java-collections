package edu.arseniumgx.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
  // Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> result = numeros.stream().filter(n -> n < 1).toList();

    if (result.isEmpty())
      System.out.println("Todos os números são positivos");
    else
      System.out.println("Nem todos os números são positivos");
  }
}
