import java.util.Scanner;

public class Menu {
    private Library library;
    private Scanner reader;

    public Menu(Library library) {
        this.library = library;
        this.reader = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Options: ");
            System.out.println("1 -> Print library contents");
            System.out.println("2 -> Add a song");
            System.out.println("3 -> Remove a song");
            System.out.println("4 -> Print songs over given play count");
            System.out.println("Choose an option: ");

            int choice = reader.nextInt();
            reader.nextLine();

            if (choice == 1) {
                this.library.printSongs();
            } else if (choice == 2) {
                addSong();
            } else if (choice == 3) {
                removeSong();
            } else if (choice == 4) {
                showSongsOverPlayCount();
            }
        }
    }

    private void addSong() {
        System.out.println("Song name: ");
        String name = reader.nextLine();
        System.out.println("Artist: ");
        String artist = reader.nextLine();
        System.out.println("Play count: ");
        int playCount = reader.nextInt();

        library.addSong(name, artist, playCount);
    }

    private void removeSong() {
        System.out.println("Song name: ");
        String name = reader.nextLine();
        library.removeSong(name);
    }

    private void showSongsOverPlayCount() {
        System.out.println("Minimum play count: ");
        int playCount = reader.nextInt();
        library.showSongsOverPlayCount(playCount);
    }
}
