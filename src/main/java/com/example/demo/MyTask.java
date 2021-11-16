package com.example.demo;

import java.util.List;

public class Task {

  /*
  Zwróć listę aktywnych graczy posortowanych po ich wyniku malejąco
   */

  public static List<Person> getActivePlayersByScoreDesc(List<Person> people) {
     people.stream()
                    .filter(person -> person.isActive())
                    .sorted(Comparator.comparing(Person::getScore))
                    .collect(Collectors.toList());
    
    throw new RuntimeException("Not Implemented!");
  }

  /*
  Zwróć listę aktywnych graczy z danej grupy posortowanych po ich wyniku malejąco
   */

  public static List<Person> getActivePlayersByScoreDesc(List<Person> people, Group group) {
    people.stream()
                    .filter(person -> person.isActive())
                    .filter(person -> person.getTeam().equals(group))
                    .sorted(Comparator.comparing(Person::getScore))
                    .collect(Collectors.toList());
    throw new RuntimeException("Not Implemented!");
  }

  /*
  Zwróć grupę, która posiada najwyższy wynik. Jeżeli wynik wielu grup jest taki sam, zwróć tę, która ma mniejszą liczbę aktywnych członków.
  Jeżeli ta liczba jest również równa, zwróć którąkolwiek z nich.
   */
  public static Group getGroupWithHighestScore(List<Person> people) {
    people.stream()
                    .sorted(Comparator.comparing(Person::getTeam))
                    .max(Comparator.comparing(Person::getScore))
                    .get();
    throw new RuntimeException("Not Implemented!");
  }

  /*
  Zwróć listę wyników posortowaną malejąco na podstawie ilości punktów per zespół.
  Pojedynczy String powinien mieć format: "NazwaGrupy CałkowityWynik (lista_aktywnych_członków) [ilość nieaktywnych członków]"
   */

  public static List<String> printPoints(List<Person> people) {
     people.stream()
                    .collect(Collectors.groupingBy(Person::getTeam));

    throw new RuntimeException("Not Implemented!");
  }
}
