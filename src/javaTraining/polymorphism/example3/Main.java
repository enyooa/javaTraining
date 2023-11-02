package javaTraining.polymorphism.example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicPlayer[] musicPlayers = new MusicPlayer[3];
        musicPlayers[0] = new Techno("Музыка Техно");
        musicPlayers[1] = new FutureSound("Музыка Будущего");
        musicPlayers[2] = new Hous("Музыка Хаус");

        while (true){
            System.out.println();
            System.out.println("Выберите музыку для проигрывание");
            for (int i = 0; i < musicPlayers.length; i++){
                System.out.println(i + 1 + ". " + musicPlayers[i].music);
            }
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 10){
                System.out.println("Выключение аудио плеера");
                break;
            }
            if (command >= 1 && command <= musicPlayers.length){
                musicPlayers[command - 1].play();
            }else {
                System.out.println("Такой команды нет");
            }
        }
    }
}
