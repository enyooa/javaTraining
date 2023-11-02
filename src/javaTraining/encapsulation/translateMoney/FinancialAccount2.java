package javaTraining.encapsulation.translateMoney;

public class FinancialAccount2 {
    private double balance;
    private int commission;
    private double withdraw;
    private String owner;


    public void transfer(FinancialAccount2 accountToTransfer, double money) {
        if (balance < money) {
            System.out.println("---");
        } else {
            accountToTransfer.balance += money;
            this.balance -= money;
        }
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void showInfo() {
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

    public void pay(double money) {
        if (balance < money) {
            System.out.println("Недостаточно средств");
        } else {
            calculateCommission();
            balance -= money;
            balance -= commission;
            System.out.println("Оплата на сумму: " + money + " была произведена");
            System.out.println("Была списана коммисия: " + commission + " Владелец: " + owner);
        }
    }

    void addMoney(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        if (balance < money) {
            System.out.println("Недостаточно средств" + " Владелец: " + owner);
        } else {
            calculateCommission();
            balance -= money;
            balance -= commission;
            System.out.println("Оплата на сумму: " + money + " была произведена");
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

    //getters
    public double getBalance() {
        return balance;
    }

    public int getCommission() {
        return commission;
    }
}
