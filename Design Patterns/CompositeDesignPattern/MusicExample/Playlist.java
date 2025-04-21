package CompositeDesignPattern.MusicExample;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements MusicComponent {
    List<MusicComponent> musicList = new ArrayList<>();

    public void add(MusicComponent component){
        musicList.add(component);
    }

    public void delete(MusicComponent component){
        musicList.remove(component);
    }

    public void play(){
        for (MusicComponent component : musicList){
            component.play();
        }
    }

    public void displayList(){
        for (MusicComponent component : musicList){
            System.out.println(component.toString());
        }
    }
}

