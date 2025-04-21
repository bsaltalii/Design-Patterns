package CompositeDesignPattern.MusicExample;

public class Song implements MusicComponent{
    String name;
    String artist;
    public Song(String name,String artist){
        this.name=name;
        this.artist=artist;
    }
    @Override
    public void play() {
        System.out.println("Song : "+ name + " Artist : "+ artist + " is playing..");
    }
    @Override
    public String toString(){
        return "Song : "+ name + " Artist : "+ artist;
    }
}
