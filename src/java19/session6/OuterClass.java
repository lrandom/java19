package java19.session6;

public class OuterClass {
    private String name = "Luan";
    private static String myStaticName = "Luan Nguyen";

    //reguler inner class
    class InnerClass{
       public void printMyName(){
           System.out.println(name);
           System.out.println(myStaticName);
       }
    }

    //static inner class
    static class StaticInnerClass{
        public void printMyName(){
            //System.out.println(name);//gọi sẽ bị lỗi vì name là non-static
            System.out.println(myStaticName);
        }
    }

    public void test(){
        class LocalMethodClass{
             public void localTest(){
                 System.out.println("hihi");
             }
        }
        LocalMethodClass localMethodClass = new LocalMethodClass();
        localMethodClass.localTest();
    }

    public static void main(String[] args) {
        OuterClass ot = new OuterClass();
        OuterClass.InnerClass inner = ot.new InnerClass();
        inner.printMyName();

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();

    }
}
