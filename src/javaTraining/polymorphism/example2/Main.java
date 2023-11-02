package javaTraining.polymorphism.example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Weapon[] weapons = new Weapon[4];
        weapons[0] = new HandGrenTh("РПГ");
        weapons[1] = new Pistol("ПИСТОЛЕТ");
        weapons[2] = new WaterPistol("ВОДЯНОЙ ПИСТОЛЕТ");
        weapons[3] = new Kalashnikov47("АК-47");

        while (true){
            System.out.println("Выберите оружие: ");
            for (int i = 0; i < weapons.length; i++){
                System.out.println(i + 1 + ". " + weapons[i].name);
            }

            int command = Integer.parseInt(scanner.nextLine());
            if(command == 0){
                System.out.println("Конец программы");
                break;
            }
            if(command >= 1 && command <= weapons.length){
                weapons[command - 1].fire();
            }
        }
    }
}
