package javaTraining.polymorphism.example_instanceof2;

public class MediaItem {
    protected int runtime;
    protected String title;

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    //getters
    public int getRuntime() {
        return runtime;
    }

    public String getTitle() {
        return title;
    }
}
