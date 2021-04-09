package java19.session5.pack4;

public class RunClass {
    public static void main(String[] args) {
        Mammal mammal = new Mammal() {
            //implement method
            @Override
            public void run() {
                System.out.println("I am running");
            }
        };
    }
}
