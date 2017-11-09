package Music;

import java.util.Random;

public class Player6 extends Mp3players {
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

        String[] currentPlaylist = getPlaylist();
        System.out.println("Player6 Playing: " + currentPlaylist[0]);
    }

    public void playAllSongs() {
        String[] currentPlaylist = getPlaylist();

        for (String name : currentPlaylist) {
            System.out.println("Player6 Playing: " + name);
        }
    }

   public void Shuffle(String[] args) {

        String[] currentPlaylist = getPlaylist();
        int index;
        String temp;

       Random random = new Random();
        for (int i = currentPlaylist.length - 1; i > 0; i--) {
          index = random.nextInt(i + 1);
            temp = currentPlaylist[index];
            currentPlaylist[index] = currentPlaylist[i];
            currentPlaylist[i] = temp;
            System.out.println("Player6 Playing: " + temp);
        }
    }
}
