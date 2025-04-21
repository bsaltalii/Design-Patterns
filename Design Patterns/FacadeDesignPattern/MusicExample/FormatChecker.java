package FacadeDesignPattern.MusicExample;

public class FormatChecker {
    public boolean checkFormat(String fileName){
        String format = fileName.split("\\.")[1];
        return format.equals("mp3");
    }
}
