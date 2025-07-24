package Interfaces;
import Interfaces.MusicPlayer;
import Interfaces.VideoPlayer;

public class Smartphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playVideo() {
        System.out.println("Reproduzindo o vídeo no smarthphone.");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausando o vídeo no smarthphone.");
    }

    @Override
    public void stopVideo() {
        System.out.println("Parando o vídeo no smarthphone.");
    }

    @Override
    public void playMusic() {
        System.out.println("Tocando a música no smarthphone.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando a música no smarthphone.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando a música no smarthphone.");
    }
}
