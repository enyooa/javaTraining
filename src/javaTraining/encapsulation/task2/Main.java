package javaTraining.encapsulation.task2;

public class Main {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        Person person1 =new Person();
        Person person2 =new Person();
        Person person3 =new Person();

        System.out.println("Укажите имя первого человека: ");
        //person1.setName(scanner.next());
        //String name = scanner.nextLine();

//        boolean isDigit = true;
//        for (int i = 0; i < name.length(); i++){
//            if (!Character.isDigit(name.charAt(i))) {
//                isDigit = false;
//            }
//        }
//        if (isDigit){
//            System.out.println("Имя не может быть числом");
//        } else {
//            System.out.println("Здравствуйте " + name);
//        }




        System.out.println("Укажите возраст первого человека: ");
       // person1.setAge(scanner.nextInt());

        System.out.println("Укажите вес первого человека: ");
     //   person1.setWeight(scanner.nextInt());
        System.out.println(person1.getName()+" Возраст: "+person1.getAge()+" Вес: "+person1.getWeight());
        System.out.println();
//
//        System.out.println("Укажите имя второго человека: ");
//      //  person2.setName(scanner.next());
//
//        System.out.println("Укажите возраст второго человека: ");
//       // person2.setAge(scanner.nextInt());
//
//        System.out.println("Укажите вес первого человека: ");
//     //   person2.setWeight(scanner.nextInt());
//        System.out.println(person2.getName()+" Возраст: "+person2.getAge()+" вес: "+person2.getWeight());
//        System.out.println();
//
//        System.out.println("Укажите имя третьего человека: ");
//      //  person3.setName(scanner.next());
//
//        System.out.println("Укажите возраст третьего человека: ");
//       // person3.setAge(scanner.nextInt());
//
//        System.out.println("Укажите вес первого человека: ");
//       // person3.setWeight(scanner.nextInt());
//        System.out.println(person3.getName()+" Возраст: "+person3.getAge()+" вес: "+person3.getWeight());
    }
}
