package javaTraining.association.aggregation.aggregation_task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя команды: ");
        String name = scanner.nextLine();
        System.out.print("Введите колличество игроков в команде '" + name + "'?");
        int amount = Integer.parseInt(scanner.nextLine());
        Team team = new Team(name, amount);

        for (int i = 0; i < amount; i++) {
            System.out.print("Введите имя игрока: ");
            team.getPlayers()[i] = new Player(scanner.nextLine());
        }

        System.out.println("Команда: " + team.getName() + " Колличество: " + amount);
        int x = 1;
        for (Player player : team.getPlayers()) {
            System.out.println(x++ + ". " + player.getName());
        }
    }
}