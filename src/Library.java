import java.util.ArrayList;

public class Library {
    private ArrayList<Song> songs;

    // Constructs an empty list of songs
    public Library() {
        this.songs = new ArrayList<>();
    }

    // Prints all songs currently in the library
    public void printSongs() {
        // Check if the library is empty
        if (this.songs.isEmpty()) {
            System.out.println("The library is empty.");
            return;
        }

        System.out.println("Library: ");
        for (Song song : this.songs) {
            System.out.println(song.displaySong());
        }
    }

    // Checks if a song with given name is in the library
    private boolean isSongInLibrary(String name) {
        for (Song song : this.songs) {
            if (song.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // Adds a new song
    public void addSong(String name, String artist, int playCount) {
        // Checks if the song isn't already in the libary
        if (isSongInLibrary(name)) {
            System.out.println("This song is already in the library");
        } else {
            this.songs.add(new Song(name, artist, playCount));
            System.out.println("Song added: " + name);
        }
    }

    // Removes a song
    public void removeSong(String name) {
        boolean removed = false;
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getName().equals(name)) {
                this.songs.remove(i);
                System.out.println("Removed song: " + name);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Song not found");
        }
    }

    // Displays songs over a given play count
    public void showSongsOverPlayCount(int playCount) {
        ArrayList<Song> filteredSongs = new ArrayList<Song>();

        // Filter songs
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getPlayCount() > playCount) {
                filteredSongs.add(this.songs.get(i));
            }
        }

        // Displays results
        if (filteredSongs.isEmpty()) {
            System.out.println("No songs over " + playCount + " plays");
        } else {
            for (Song song : filteredSongs) {
                System.out.println(song.displaySong());
            }
        }
    }
}
