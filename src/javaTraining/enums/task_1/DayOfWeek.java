package javaTraining.enums.task_1;

public enum DayOfWeek {
    MONDAY("Понидельник", "(ПН)"),
    TUESDAY("Вторник", "(ВТ)"),
    WEDNESDAY("Среда", "(СР)"),
    THURSDAY("Четверг", "(ЧТ)"),
    FRIDAY("Пятница", "(ПТ)"),
    SATURDAY("Субота", "(СБ)"),
    SUNDAY("Воскресение", "(ВС)");

    private final String displayName;
    private final String shortName;

    DayOfWeek(String displayName, String shortName) {
        this.displayName = displayName;
        this.shortName = shortName;
    }
    public String getDisplayName() {
        return displayName;
    }
    public String getShortName() {
        return shortName;
    }
}
