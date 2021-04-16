package java19.session6;

public class Computer implements IHardware,ISoftware {
    @Override
    public void turnOn() {
        System.out.println("turn on computer");
    }

    @Override
    public void bootOS() {
        System.out.println("boot OS");
    }
}
