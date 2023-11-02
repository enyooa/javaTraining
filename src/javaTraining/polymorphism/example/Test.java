package javaTraining.polymorphism.example;

public class Test {
    public static void main(String[] args) {
        Lion simba = new Lion();
        Tiger tigra = new Tiger();
        Cheetah cheek = new Cheetah();
        Doctor aibolit = new Doctor();

        aibolit.healLion(simba);
        aibolit.healTiger(tigra);
        aibolit.healCheetah(cheek);

        System.out.println();

        aibolit.healCat(simba);
        aibolit.healCat(tigra);
        aibolit.healCat(cheek);
    }


}

