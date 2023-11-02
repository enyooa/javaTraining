package javaTraining.string.stringFormateTask;

public class Car {
    private String model;
    private String country;
    private int maxSpeed;

    public Car(String model, String country, int maxSpeed) {
        this.model = model;
        this.country = country;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
