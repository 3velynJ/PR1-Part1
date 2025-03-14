public class Main {
    public static void main(String[] args) {

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

        Menu menu = new Menu(library);
        menu.start();
    }
}