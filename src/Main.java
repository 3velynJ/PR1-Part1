import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Library library = new Library();

        library.addSong("Close to me", "The Cure", 380017911);
        library.addSong("Your Woman", "White Town", 179325728);
        library.addSong("Crystalised", "The xx", 303816629);
        library.addSong("Using Our Feet", "Badly Drawn Boy", 135788);
        library.addSong("Disorder", "Joy Division", 216786167);
        library.addSong("Heaven or Las Vegas", "Cocteau Twins", 85215535);
        library.addSong("Bug", "Fontaines D.C.", 29935477);
        library.addSong("Instant Crush", "Daft Punk", 670540409);
        library.addSong("Luna", "The Smashing Pumpkins", 68487391);
        library.addSong("Too Shy", "Kajagoogoo", 77464362);

        library.printSongs();

        while (true) {
            System.out.println("Options: ");
            System.out.println("1 -> Print library contents");
            System.out.println("2 -> Add a song");
            System.out.println("3 -> Remove a song");
            System.out.println("Choose an option: ");

            int choice = reader.nextInt();
            reader.nextLine();

            if (choice == 1) {
                library.printSongs();
            } else if (choice == 2) {
                System.out.println("Song name: ");
                String name = reader.nextLine();
                System.out.println("Artist: ");
                String artist = reader.nextLine();
                System.out.println("Play count: ");
                int playCount = reader.nextInt();
                //Data type validation
                //Check if song already in library??
                library.addSong(name, artist, playCount);
            } else if (choice == 3) {
                System.out.println("Song name: ");
                String name = reader.nextLine();
                library.removeSong(name);
            }
        }
    }
}