package javaTraining.polymorphism.example3;

public class Hous extends MusicPlayer {
    public Hous(String music){
        super(music);
    }

    @Override
    void play(){
        System.out.println("Воспроизводится аудио Electro Hous");
    }
}
