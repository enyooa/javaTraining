package javaTraining.association.aggregation.aggregation_task_3;

public class Team {
    private String name;
    private Player[] players;

    //constructor
    public Team(String name, int amountOfPlayers) {
        this.name = name;
        this.players = new Player[amountOfPlayers];
    }

    //    method
    public void addPlayer(Player player) {
        players[0] = player;
    }


    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    //getters
    public String getName() {
        return name;
    }
    public Player[] getPlayers() {
        return players;
    }
}