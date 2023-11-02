package javaTraining.encapsulation.translateMoney;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько аккаунтов хотите создать?");
        int size2 = Integer.parseInt(scanner.nextLine());

        FinancialAccount2[] financialAccount2s = new FinancialAccount2[size2];

        for (int i = 0; i < financialAccount2s.length; i++) {
            FinancialAccount2 financialAccount2 = new FinancialAccount2();

            System.out.println("Сколько хотите установить баланс?");
            financialAccount2.setBalance(scanner.nextDouble());

            System.out.println("Введите своё имя");
            financialAccount2.setOwner(scanner.next());


//            financialAccount2.transfer(scanner.nextLine(), scanner.nextDouble());
//            // как сдесь работать ???

        System.out.println(financialAccount2.getBalance());

        }
    }
}

