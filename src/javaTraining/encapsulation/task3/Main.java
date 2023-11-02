package javaTraining.encapsulation.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinancialAccount financialAccount = new FinancialAccount();
        System.out.println("Введите своё имя");
        financialAccount.setOwner(scanner.nextLine());

        while (true){
        printMenu();
        int command = scanner.nextInt();

        if (command == 1){
            System.out.println("Сколько хотите установить баланс?");
            financialAccount.setBalance(scanner.nextDouble());
            System.out.println();
        } else if (command == 2){
            System.out.println("Сколько хотите добавить баланс?");
            financialAccount.addMoney(scanner.nextDouble());
            System.out.println();
        } else if (command == 3){
            System.out.println("На сколько хотите сделать покупку?");
            financialAccount.pay(scanner.nextDouble());
            System.out.println();
        } else if (command == 4) {
            System.out.println("Сколько хотите снять средства?");
            financialAccount.withdraw(scanner.nextDouble());
            System.out.println();
        }
            System.out.println(financialAccount.getBalance());
        }
    }
    public static void printMenu() {
        System.out.println("Выберите опирацию:");
        System.out.println("1. Установить баланс");
        System.out.println("2. Добавить баланс");
        System.out.println("3. Сделать покупку");
        System.out.println("4. Снять средства");
        System.out.println();
    }
}
