package java19.session5.pack3;

public class Truck extends Transporter{
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setCargoName("Đậu");
        System.out.println(truck.getCargoName());
    }
}
