package javaTraining.polymorphism.example3;

public class Techno extends MusicPlayer {
    public Techno(String music){
        super(music);
    }

    @Override
    void play(){
        System.out.println("Возпроизводится аудио Minimal");
    }
}
