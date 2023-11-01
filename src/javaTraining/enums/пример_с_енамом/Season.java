package javaTraining.enums.пример_с_енамом;

public enum Season {

    WINTER("зима"),
    SPRING("весна"),
    SUMMER("лето"),
    AUTUMN("осень"),
    UNKNOWN("неизвестный");

    private final String rusName;

    Season(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }
}
