public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addSong("Close to me", "The Cure", 380017911);
        library.printSongs();
        library.removeSong("Close to me");
        library.printSongs();
    }
}