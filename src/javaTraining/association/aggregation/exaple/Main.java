package javaTraining.association.aggregation.exaple;

public class Main {
    public static void main(String[] args) {
        Company google = new Company("Google", 120);
        Company apple =new Company("Apple", 50);

        Employee employee = new Employee("Steve Jobs", google);
        employee.setCompany(apple);

        System.out.println(employee.getName());
        System.out.println(employee.getCompany().getName());
    }
}
