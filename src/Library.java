import java.util.ArrayList;

public class Library {
    private ArrayList<Song> songs;

    public Library() {
        this.songs = new ArrayList<>();
    }

    public void printSongs() {
        for (Song song : this.songs) {
            System.out.println(song.displaySong());
        }
    }

    public void addSong(String name, String artist, int playCount) {
        this.songs.add(new Song(name, artist, playCount));
        System.out.println("Song added: " + name);
    }

    public void removeSong(String name) {
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getName().equals(name)) {
                this.songs.remove(i);
                System.out.println("Removed song: " + name);
            }
        }
    }
}
