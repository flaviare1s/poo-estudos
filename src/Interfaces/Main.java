package Interfaces;

public class Main {
    public static void main(String[] args) {

        var musicPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Tocando a música...");
            }

            @Override
            public void pauseMusic() {

            }

            @Override
            public void stopMusic() {

            }
        };
        musicPlayer.playMusic();
    }

    public void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
