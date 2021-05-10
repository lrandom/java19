package java19.session9;

public class GenericClassDemo<T,K>{
    T a;
    T b;
    K c;

    public T getA(){
        return this.a ;
    }

    public T getB(){
        return this.b;
    }

    public K getC(){
        return this.c;
    }


    public void setA(T a){
        this.a = a;
    }

    public void setB(T b){
        this.b = b;
    }

    public void setC(K c){
        this.c = c;
    }

    public<E> void getName(E input){
        System.out.println(input);
    }



    public static void main(String[] args) {
        GenericClassDemo<Integer,Float> genericClassDemo = new GenericClassDemo<>();
        GenericClassDemo<Float,Long> genericClassDemo2 = new GenericClassDemo<>();
        genericClassDemo2.getName("test");
        genericClassDemo2.getName(1);
        genericClassDemo2.getName(1.0);
    }



}
