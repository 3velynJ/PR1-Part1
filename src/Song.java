public class Song {
    private String name;
    private String artist;
    private int playCount;

    public Song(String name, String artist, int playCount) {
        this.name = name;
        this.artist = artist;
        this.playCount = playCount;
    }

    public String displaySong() {
        return this.name + " - " + this.artist + " (" + this.playCount + ")";
    }

    public String getName() {
        return this.name;
    }
}
