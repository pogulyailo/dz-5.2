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
    public void playSong() {

        String [] currentPlaylist = getPlaylist();
        System.out.println("Player4 Playing: " + currentPlaylist[currentPlaylist.length-1]);
    }

    public void playAllSongs() {
        String [] currentPlaylist = getPlaylist();

        for (String name : currentPlaylist) {
            System.out.println("Player4 Playing: " + name);
        }
    }
}
