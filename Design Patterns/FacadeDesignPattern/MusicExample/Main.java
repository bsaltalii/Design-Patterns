package FacadeDesignPattern.MusicExample;

public class Main {
    public static void main(String[] args) {
        MusicPlayerFacade musicPlayer = new MusicPlayerFacade();
        musicPlayer.play("file.mp3");
    }
}
