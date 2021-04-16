package java19.session6;

public class Tiger {
    public void onRunListener(OnRunListener onRunListener){
        System.out.println("I am tiger");
        onRunListener.run();
        System.out.println("I am running at 120km/h");
    }



    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.onRunListener(new OnRunListener() {
            @Override
            public void run() {
                System.out.println("I am running at 10km/h");
                System.out.println("I am running at 40km/h ");
                System.out.println("I am running at 80km/h ");
            }
        });

        Tiger tiger1 = new Tiger();
        tiger1.onRunListener(new OnRunListener() {
            @Override
            public void run() {
                System.out.println("I am running at 10km/h");
                System.out.println("I am running at 20km/h ");
                System.out.println("I am running at 30km/h ");
                System.out.println("I am running at 40km/h ");
                System.out.println("I am running at 50km/h ");
                System.out.println("I am running at 60km/h ");
                System.out.println("I am running at 70km/h ");
                System.out.println("I am running at 80km/h ");
            }
        });
    }
}
