import java.util.Scanner;

public class Menu {
    private Library library;
    private Scanner reader;

    // Construct menu, taking a library as a parameter
    public Menu(Library library) {
        this.library = library;
        this.reader = new Scanner(System.in);
    }

    // Start console menu
    public void start() {
        while (true) {
            System.out.println("Options: ");
            System.out.println("1 -> Print library contents");
            System.out.println("2 -> Add a song");
            System.out.println("3 -> Remove a song");
            System.out.println("4 -> Print songs over given play count");
            System.out.println("Choose an option: ");

            // Handle non-integer inputs
            if (!reader.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                reader.next();
                continue;
            }

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
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    // Collect user inputs and add a new song
    private void addSong() {
        String name;
        String artist;
        int playCount;

        // Loop until valid song name is provided
        while (true) {
            System.out.print("Enter song name: ");
            name = reader.nextLine();

            if (name.isEmpty()) {
                System.out.println("Song name cannot be empty. Please try again.");
            } else {
                break;
            }
        }

        // Loop until valid artist name is provided
        while (true) {
            System.out.print("Enter artist name: ");
            artist = reader.nextLine();

            if (artist.isEmpty()) {
                System.out.println("Artist name cannot be empty. Please try again.");
            } else {
                break;
            }
        }

        // Loop until a valid play count is provided
        while (true) {
            System.out.print("Enter play count: ");

            if (!reader.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid play count.");
                reader.nextLine();
                continue;
            }

            playCount = reader.nextInt();
            reader.nextLine();

            if (playCount < 0) {
                System.out.println("Play count cannot be negative. Please enter a valid number.");
            } else {
                break;
            }
        }

        library.addSong(name, artist, playCount);
    }

    // Remove a song by name
    private void removeSong() {
        System.out.println("Song name: ");
        String name = reader.nextLine();
        library.removeSong(name);
    }

    // Show songs with a play count over user input
    private void showSongsOverPlayCount() {
        System.out.println("Minimum play count: ");

        // Handle non-integer inputs
        if (!reader.hasNextInt()) {
            System.out.println("Invalid play count. Please enter a valid number.");
            reader.nextLine(); // Clear invalid input
            return;
        }
        int playCount = reader.nextInt();
        reader.nextLine();

        library.showSongsOverPlayCount(playCount);
    }
}
