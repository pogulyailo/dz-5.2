package Music;

public class Player1 extends Mp3players {

    private final double price;

    public Player1(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getSong() {
        return super.getSong();
    }

    public void playSong() {
       System.out.println("Player1 Playing: " + getSong());
        }
    }