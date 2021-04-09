package java19.session5.pack3;

public class Ship extends Transporter{

    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.setCargoName("Dầu ăn");
        System.out.println(ship.getCargoName());
    }
}
