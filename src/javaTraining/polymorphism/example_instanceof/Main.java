package javaTraining.polymorphism.example_instanceof;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicPlayer[] musicPlayers = new MusicPlayer[14];
        musicPlayers[0] = new Techno("Музыка Техно");
        musicPlayers[1] = new FutureSound("Музыка Будущего");
        musicPlayers[2] = new Hous("Музыка Хаус");
        musicPlayers[3] = new FutureSound("Музыка Будущего");
        musicPlayers[4] = new Hous("Музыка Хаус");
        musicPlayers[5] = new Hous("Музыка Хаус");
        musicPlayers[6] = new FutureSound("Музыка Будущего");
        musicPlayers[7] = new Techno("Музыка Техно");
        musicPlayers[8] = new Hous("Музыка Хаус");
        musicPlayers[9] = new Hous("Музыка Хаус");
        musicPlayers[10] = new Techno("Музыка Техно");
        musicPlayers[11] = new Techno("Музыка Техно");
        musicPlayers[12] = new Hous("Музыка Хаус");
        musicPlayers[13] = new Hous("Музыка Хаус");

        // проверка: instanceof

        int techno = 0;
        int futureSound = 0;
        int hous = 0;
        for (MusicPlayer musicPlayer : musicPlayers) {
            if (musicPlayer instanceof Techno) {
                techno +=1;
            } else if (musicPlayer instanceof Hous){
                hous +=1;
            } else if (musicPlayer instanceof FutureSound) {
                futureSound +=1;
            }
        }
        System.out.println("Музыка Тexно: " + techno);
        System.out.println("Музыка Хаус: " + hous);
        System.out.println("Музыка будущего: " + futureSound);
    }
}
