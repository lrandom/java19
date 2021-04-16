package java19.session6;

public class Calculator {
    public float getSum(int a, int b){
        return a+b;
    }

    public float getSum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
