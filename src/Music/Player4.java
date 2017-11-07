package Music;

public class Player4 extends Mp3players{
    private final double price;

    public Player4(String song, String[] playlist, double price) {
        super(song, playlist);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
