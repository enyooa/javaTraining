package javaTraining.association.aggregation.aggregation_task_3;

public class Player {
    private String name;
    private Team team;

    //constructors
    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }


    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    //getters
    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }
}