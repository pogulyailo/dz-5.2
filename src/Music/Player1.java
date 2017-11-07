package Music;

public class Player1 extends Mp3players {

    private final double price;

    public Player1(String song, String[] playlist, double price) {
        super(song, playlist);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}