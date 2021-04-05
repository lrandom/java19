package java19.session4.exercise1;

public class Calculator {
    private float num1,num2;

    public Calculator() {
    }

    public Calculator(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getSum(){
        return this.num1+this.num2;
    }

    public float getSub(){
        return this.num1 - this.num2;
    }

    public float getMultiple(){
        return this.num1 * this.num2;
    }

    public float getDivide(){
        return this.num1/ this.num2;
    }

    public static void main(String[] args) {
        System.out.printf("Với hai số %d và %d ta có",10,2);
        Calculator calc = new Calculator(10,2);
        System.out.println("Tổng là "+calc.getSum());
        System.out.println("Hiệu là "+calc.getSub());
        System.out.println("Tích là "+calc.getMultiple());
        System.out.println("Thương là "+calc.getDivide());
    }
}
