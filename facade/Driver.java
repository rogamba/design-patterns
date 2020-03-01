/**
 * A facade tries to encapsulate and simplify behaviour
 * that otherwise would require interacting with many objects
 */
public class Driver {
    public static void main(String[] args) {
        // Components of the Facade
        DvdPlayer dvd = new DvdPlayer();
        Amplifier amplifier = new Aplifier();
        Screen screen = new Screen();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvd, screen, projector);
        movie = new Movie();
        homeTheater.watchMovie(movie);
    }
}