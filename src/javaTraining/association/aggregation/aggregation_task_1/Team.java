package javaTraining.association.aggregation.aggregation_task_1;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name, int amountOfPlayers) {
        this.name = name;
        this.players = new Player[amountOfPlayers];
    }


    public void addPlayer(Player player) {
        players[0] = player;
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
