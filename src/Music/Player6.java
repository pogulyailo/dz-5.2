package Music;

public class Player6 extends Mp3players{
    private final double price;

    public Player6(String song, String[] playlist, double price) {
        super(song, playlist);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void playSong() {
        String getSong;

        String [] currentPlaylist = getPlaylist();
        System.out.println("Player6 Playing: " + currentPlaylist[0] );
    }

    public void playAllSongs() {
        String [] currentPlaylist = getPlaylist();

        for (String name : currentPlaylist) {
            System.out.println("Player6 Playing: " + name);
        }
    }
}
