package Music;

public class Player5 extends Mp3players{
    private final double price;

    public Player5(String song, String[] playlist, double price) {
        super(song, playlist);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void playSong() {
        String getSong;

        String [] currentPlaylist = getPlaylist();
        System.out.println("Player5 Playing: " + currentPlaylist[0] );
    }

    public void playAllSongs() {
        String[] currentPlaylist = getPlaylist();

        for (currentPlaylist = getPlaylist(); currentPlaylist < getPlaylist().length; currentPlaylist--){
            String name : currentPlaylist;

            System.out.println("Player5 Playing: " + name);
        }
    }
}
