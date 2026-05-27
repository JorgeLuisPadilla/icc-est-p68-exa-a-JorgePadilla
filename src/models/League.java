package models;

import models.Player;

public class League {
  private String name;
  private Team[] teams;

  public League(String name, Team[] teams) {
    this.name = name;
    this.teams = teams;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team[] getTeams() {
    return teams;
  }

  public void setTeams(Team[] teams) {
    this.teams = teams;
  }

  public int getTotalActiveGoals() {

    int total = 0;

    for (Team team : teams) {

      for (String name : name.getGoals()) {

        // si es valido suma 1
        if (goals.isValid()) {
          total++;
        }
      }
    }

    // retorna total
    return total;
  }

}
