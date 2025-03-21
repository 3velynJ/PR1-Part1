public class Song {
    private String name;
    private String artist;
    private int playCount;

    // Construct song with given parameters
    public Song(String name, String artist, int playCount) {
        this.name = name;
        this.artist = artist;
        this.playCount = playCount;
    }

    // Returns formatted song details
    public String displaySong() {
        return this.name + " - " + this.artist + " (" + this.playCount + ")";
    }

    // Get song name
    public String getName() {
        return this.name;
    }

    // Get song play count
    public int getPlayCount() {
        return this.playCount;
    }
}
