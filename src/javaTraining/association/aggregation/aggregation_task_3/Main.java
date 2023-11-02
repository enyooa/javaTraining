package javaTraining.association.aggregation.aggregation_task_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите колличество команд");
        int size = Integer.parseInt(scanner.nextLine());

        Team[] teams = new Team[size];
        for (int i = 0; i < teams.length; i++) {

            System.out.print("Введите имя команды: ");
            String name = scanner.nextLine();

            System.out.print("Введите колличество игроков в команде '" + name + "'?");
            int amount = Integer.parseInt(scanner.nextLine());

            Team team = new Team(name, amount);

            for (int j = 0; j < amount; j++) {
                System.out.print("Введите имя игрока: ");
                team.getPlayers()[j] = new Player(scanner.nextLine(), team);
            }
            teams[i] = team;
        }

        for (Team team : teams) {
            System.out.println("Команда: " + team.getName());
            int x = 1;
            for (Player player : team.getPlayers()) {
                System.out.println(x++ + ". " + player.getName());
            }
        }
    }
}