package FacadeDesignPattern.MusicExample;

public class MusicPlayerFacade {
    private AudioPlayer audioPlayer;
    private FileLoader fileLoader;
    private FormatChecker formatChecker;

    public MusicPlayerFacade(){
        audioPlayer=new AudioPlayer();
        fileLoader=new FileLoader();
        formatChecker = new FormatChecker();
    }

    public void play(String fileName){
        if(formatChecker.checkFormat(fileName)){
            fileLoader.load(fileName);
            audioPlayer.startAudio();
            System.out.println("Playing file : " + fileName);
        }else{
            System.out.println("Incorrect format");
        }
    }
}
