package javaTraining.enums.task_3;

public enum Country {
    CANADA("CAD"),
    USA("USD"),
    GERMANY("EUR");

    private String currency;

    Country(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
