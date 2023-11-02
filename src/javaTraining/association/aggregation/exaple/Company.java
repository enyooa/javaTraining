package javaTraining.association.aggregation.exaple;

public class Company {
    private String name;
    private int amountOfEmployees;

    public Company(String name, int amountOfEmployees) {
        this.name = name;
        this.amountOfEmployees = amountOfEmployees;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getAmountOfEmployees() {
        return amountOfEmployees;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAmountOfEmployees(int amountOfEmployees) {
        this.amountOfEmployees = amountOfEmployees;
    }
}
