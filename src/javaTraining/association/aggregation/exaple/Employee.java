package javaTraining.association.aggregation.exaple;

public class Employee {
    private String name;
    private Company company;

    public Employee(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    //getters
    public String getName() {
        return name;
    }
    public Company getCompany() {
        return company;
    }
}
