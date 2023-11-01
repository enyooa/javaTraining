package javaTraining.enums.task_2;

public class VeryStrictDiet {
    public void takeLunch(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case MONDAY -> System.out.println("Понедельник: куриная лапша");
            case TUESDAY -> System.out.println("Вторник: суп из сельдерея");
            case WEDNESDAY -> System.out.println("Среда: борщ со сметаной");
            case THURSDAY -> System.out.println("Четверг: плов с овощами");
            case FRIDAY -> System.out.println("Пятница: творожок с фруктами");
            case SATURDAY -> System.out.println("Суббота: клубника со сливками");
            case SUNDAY -> System.out.println("Воскресенье: макарошки с сыром");
            default -> System.out.println("Default");
        }
    }
}
