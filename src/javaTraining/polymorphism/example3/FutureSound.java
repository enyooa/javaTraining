package javaTraining.polymorphism.example3;

public class FutureSound extends MusicPlayer{
    public FutureSound(String music){
        super(music);
    }

    @Override
    void play(){
        System.out.println("Воспроизводится аудио Progressive Hous");
    }
}
