package Music;

public class Player3 extends Mp3players {
    private final double price;

    public Player3(String song, String[] playlist, double price) {
        super(song, playlist);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void playSong() {
        String getSong;

        if (getSong() != null)
            getSong = getSong();
        else
            getSong = " select folder ";
        System.out.println("Playing: " + getSong);
    }

    public void playAllSongs() {
        String playlist[] = new String[0];

        for (String name : playlist) {
            setSong(name);
            playSong();
            System.out.println("Playing: " + playlist[1]);
        }
    }
}