package edu.arseniumgx.collections.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
  private final Map<LocalDate, Evento> agendaEventosMap;

  public AgendaEventos() {
    this.agendaEventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    agendaEventosMap.put(data, new Evento(nome, atracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    //Set<LocalDate> dateSet = agendaEventosMap.keySet();
    //Collections<Evento> values = agendaEventosMap.values();
    //agendaEventosMap.get();

    LocalDate dataAtual = LocalDate.now();
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);

    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        System.out.println("Próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
    agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 10), "Evento 4", "Atração 4");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 20), "Evento 5", "Atração 5");

    agendaEventos.exibirAgenda();

    agendaEventos.obterProximoEvento();
  }
}
