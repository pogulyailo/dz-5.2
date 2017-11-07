package Music;

public class Player2 extends Mp3players {
    private final double price;

    public Player2(String song, String[] playlist, double price) {
        super(song, playlist);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void playSong() {
        String getSong;

        if (getSong() != null)
            getSong = "error";
        else
            getSong = " select a song ";
        System.out.println("Playing: " + getSong);
    }
}