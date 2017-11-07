package Music;

public class Player3 extends Mp3players{
    private final double price;

    public Player3(String song, String[] playlist, double price) {
        super(song, playlist);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void playList() {
        String[] getPlaylist;

        if (getPlaylist() != null)
            getPlaylist = getPlaylist();
        else
            getPlaylist = " select folder ";
        System.out.println("Playing: " + getPlaylist);
    }
}
