import Music.Mp3players;
import Music.Player1;
import Music.Player2;
import Music.Player3;

public class Main {
    public static void main(String[] args) {
        String [] playList = {"The best Song", "Good song", "Super Song"};
        Mp3players mp3players = new Mp3players("The best Song", playList);
        Player1 player1 = new Player1("The best Song", playList,100.0);
        Player2 player2 = new Player2("The best Song", playList,100.0);
        Player3 player3 = new Player3("The best Song", playList,100.0);

         player1.playSong();
         player2.playSong();
         player3.playList();
    }

}
