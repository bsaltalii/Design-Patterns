package CompositeDesignPattern.MusicExample;

public class Main {
    public static void main(String[] args) {
        MusicComponent song1 = new Song("Cold","Chris Stapleton");
        MusicComponent song2 = new Song("Bad Dreams","Teddy Swims");
        MusicComponent song3 = new Song("Midnight Train","Sam Smith");

        Playlist countryList = new Playlist();
        countryList.add(song1);
        countryList.add(song2);

        Playlist rnbList = new Playlist();
        rnbList.add(song3);

        Playlist allSongs = new Playlist();
        allSongs.add(countryList);
        allSongs.add(rnbList);

        allSongs.play();
    }
}

