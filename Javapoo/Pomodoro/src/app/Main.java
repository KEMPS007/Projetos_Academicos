package app;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos minutos: ");
        int minutos = sc.nextInt();

        int segundos = minutos * 60;


        for (int i = segundos; i >= 0; i--){
            System.out.println(i);
            try{Thread.sleep(1000); } catch (InterruptedException e){}

        }
        tocarmusica();

        sc.close();
    }
    public static void tocarmusica(){
       try{ File arquivo = new File("C:\\Users\\razer\\OneDrive\\Documentos\\Java\\Pomodoro\\src\\app\\musica.wav");
           AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivo);
           Clip clip = AudioSystem.getClip();
           clip.open(audioInputStream);
           clip.start();

           Thread.sleep(clip.getMicrosecondLength()/1000);
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e){
           System.out.println("Erro ao tocar o som: " + e.getMessage());
       }
    }

}
