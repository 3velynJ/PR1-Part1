import java.util.ArrayList;

public class Library {
    private ArrayList<Song> songs;

    public Library() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String name, String artist, int playCount) {
        songs.add(new Song(name, artist, playCount));
        System.out.println("Song added: " + name);
    }
}
