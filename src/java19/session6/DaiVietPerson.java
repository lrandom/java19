package java19.session6;

public class DaiVietPerson extends Person {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Eat Rice");
    }

    public static void main(String[] args) {
        DaiVietPerson luan = new DaiVietPerson();
        luan.eat();
    }


}
