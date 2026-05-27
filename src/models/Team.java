package models;

public class Team extends League {
  private String name;
  private Player[] players;

  public Team(String name, Team[] teams, String name2, Player[] players) {
    super(name, teams);
    name = name2;
    this.players = players;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Player[] getPlayers() {
    return players;
  }

  public void setPlayers(Player[] players) {
    this.players = players;
  }

}
