package java19.session4;

import com.sun.tools.internal.xjc.Driver;

public class Bus {
    private static String nameOfClass = "Bus";

    private int numOfWheel;
    private String color;
    private Human driver;



    public void setNumOfWheel(int numOfWheel){
        this.numOfWheel = numOfWheel;
        this.numOfWheel+=1;
    }

    public int getNumOfWheel(){
        return this.numOfWheel;
    }

    public void setDriver(Human driver){
        this.driver = driver;
        this.driver.setEyeColor("Màu xanh");
    }

    public static void main(String[] args) {
        System.out.println(Bus.nameOfClass);
        Bus bus = new Bus();
        int numOfWheel = 4;
        bus.setNumOfWheel(numOfWheel);
        System.out.println(numOfWheel);

        Human driver = new Human();
        driver.setEyeColor("Màu đỏ");
        bus.setDriver(driver);
        System.out.println(driver.getEyeColor());
    }
}
