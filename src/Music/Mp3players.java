package Music;

public class Mp3players {
    private String song;
    private String [] playlist;

    public Mp3players(String song, String[] playlist) {
        this.song = song;
        this.playlist = playlist;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }
}
