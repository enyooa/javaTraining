package javaTraining.polymorphism.example_instanceof;

public class MusicPlayer {
    String music;

    public MusicPlayer(String music) {
        this.music = music;
    }

    void play(){
        System.out.println("Запуск проигрывателя");
    }
}
