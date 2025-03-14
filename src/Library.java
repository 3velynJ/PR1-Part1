import java.util.ArrayList;

public class Library {
    private ArrayList<Song> songs;

    public Library() {
        this.songs = new ArrayList<>();
    }

    public void printSongs() {
        System.out.println("Library: ");
        for (Song song : this.songs) {
            System.out.println(song.displaySong());
        }
    }

    private boolean isSongInLibrary(String name) {
        for (Song song : this.songs) {
            if (song.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void addSong(String name, String artist, int playCount) {
        if (isSongInLibrary(name)) {
            System.out.println("This song is already in the library");
        } else {
            this.songs.add(new Song(name, artist, playCount));
            System.out.println("Song added: " + name);
        }
    }

    public void removeSong(String name) {
        boolean removed = false;
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getName().equals(name)) {
                this.songs.remove(i);
                System.out.println("Removed song: " + name);
                removed = true;
            }
        }
        if (!removed) {
            System.out.println("Song not found");
        }
    }

    public void showSongsOverPlayCount(int playCount) {
        ArrayList<Song> filteredSongs = new ArrayList<Song>();
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getPlayCount() > playCount) {
                filteredSongs.add(this.songs.get(i));
            }
        }
        if (filteredSongs.isEmpty()) {
            System.out.println("No songs over " + playCount + " plays");
        } else {
            for (Song song : filteredSongs) {
                System.out.println(song.displaySong());
            }
        }
    }
}
