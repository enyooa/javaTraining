package javaTraining.association.aggregation.aggregation_task_1;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Chelsea", 5);

        Player player1 = new Player("Alex", team);
        Player player2 = new Player("Tima", team);
        Player player3 = new Player("Daniel", team);
        Player player4 = new Player("Aruzhan", team);
        Player player5 = new Player("Petya", team);

        team.addPlayer(player1);

        Player[] teamPlayers = team.getPlayers();
        System.out.println(teamPlayers[0].getName());
    }
}
