import Music.*;

public class Main {
    public static void main(String[] args) {
        String [] playList = {"The best Song", "Good song", "Super Song"};
        Mp3players mp3players = new Mp3players("The best Song", playList);
        Player1 player1 = new Player1(100.0);
        Player2 player2 = new Player2(100.0);
        Player3 player3 = new Player3("The best Song", playList,100.0);
        Player4 player4 = new Player4("The best Song", playList,100.0);
        Player5 player5 = new Player5("Super Song", playList,100.0);
        Player6 player6 = new Player6("Super Song", playList,100.0);


        player1.playSong();
        player2.playSong();
        player3.playSong();
        player3.playAllSongs();
        player4.playSong();
        player4.playAllSongs();
        player5.playSong();
        player5.playAllSongs();
        player6.playSong();
        player6.playAllSongs();
    }

}