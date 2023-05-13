package main;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
    Clip clip;
    File sound[] = new File[30];
    
    public Sound(){
        sound[0] = new File("res/sound/bg.wav");
    }
    
    public void setFile(int i){
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(sound[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    
    public void play(){
        clip.start();
    }
    
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public void stop(){
        clip.stop();
    }
}