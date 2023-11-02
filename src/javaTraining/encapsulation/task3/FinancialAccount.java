package javaTraining.encapsulation.task3;

public class FinancialAccount {
    private double balance;
    private int commission;
    private double withdraw;
    private String owner;


    public void showInfo(String owner) {
        System.out.println("Владелец: " + owner);
    }

    //methods
    public void calculateCommission() {
        if (this.balance < 25000) {
            commission = 250;
        } else {
            commission = 500;
        }
    }
    void addMoney(double money) {
        balance += money;
    }
    public void pay(double money) {
        if (balance < money) {
            System.out.println("Недостаточно средств");
        } else {
            calculateCommission();
            balance -= money;
            balance -= commission;
            System.out.println("Была произведена оплата на сумму: " + money);
            System.out.println("Была списана коммисия: " + commission + " Владелец: " + owner);
        }
    }
    public void withdraw(double money) {
        if (balance < money) {
            System.out.println("Недостаточно средств" + " Владелец: " + owner);
        } else {
            calculateCommission();
            balance -= money;
            balance -= commission;
            System.out.println("Произведено снятие суммы: " + money);
            System.out.println("Была списана коммисия: " + commission + " Владелец: " + owner);
        }
    }

    //setters
    public void setBalance(double balance) {
        if (0 < balance) {
            this.balance = balance;
        } else {
            System.out.println("Баланс не может выйти в минус");
        }
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    //getters
    public double getBalance() {
        return balance;
    }

    public int getCommission() {
        return commission;
    }
}
