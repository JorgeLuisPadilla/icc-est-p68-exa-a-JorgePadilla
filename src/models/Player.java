package models;

public class Player extends League {
  private String name;
  private int goals;
  private boolean isActive;

  public Player(String name, Team[] teams, String name2, int goals, boolean isActive) {
    super(name, teams);
    name = name2;
    this.goals = goals;
    this.isActive = isActive;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGoals() {
    return goals;
  }

  public void setGoals(int goals) {
    this.goals = goals;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

}
