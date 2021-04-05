package java19.session4;


public class Human{
    private String eyeColor;
    private String hairColor;
    private String skinColor;
    private String tall;

    public Human(){

    }

    public Human(String eyeColor,String hairColor,String skinColor,String tall){
        this.eyeColor= eyeColor;
        this.hairColor= hairColor;
        this.skinColor=skinColor;
        this.tall=tall;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor(){
        return this.eyeColor;
    }

    //lombok

    public void eat(){
        System.out.println("I am eating");
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void learning(){
        System.out.println("I am learning");
    }

    public static void main(String[] args) {
        Human luan = new Human("Mắt nâu", "Tóc đen", "Da vàng", "1.72");
        luan.eat();
        luan.sleep();
    }
}
