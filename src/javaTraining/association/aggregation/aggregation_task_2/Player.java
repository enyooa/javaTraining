package javaTraining.association.aggregation.aggregation_task_2;

public class Player {
    private String name;
    private Team team;

    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }
    public Player(Team team) {
        this.team = team;
    }
    public Player() {
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
}