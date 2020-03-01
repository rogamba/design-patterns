public class HomeTheaterFacade {

    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Screen screen;
    private Projector projector;

    HomeTheaterFacade(
        Amplifier amplifier,
        DvdPlayer dvdPlayer,
        Screen screen,
        Projector projector
    ){
        this.aplifier=amplifier;
        this.dvdPlayer=dvdPlayer;
        this.screen=screen;
        this.projector=projector;
    }

    public void watchMovie(Movie movie){
        // Simplify the process of watching the movie
        this.amplifier.turnOn();
        this.amplifier.setLevel(5);
        this.screen.rollDown();
        this.projector.turnOn();
        this.projector.setWideScreen();
        this.dvdPlayer.on();
        this.dvdPlayer.play(movie);
    }
}