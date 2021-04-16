package java19.session7;

public class ATM {
    public float amount = 1000000;
    public float withdraw(float withdrawAmount) throws OutOfMoneyException{
        if(amount < withdrawAmount){
            throw new OutOfMoneyException("withdraw amount less than amount");
        }
        return amount-withdrawAmount;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(12270000);
        }catch (OutOfMoneyException e){
            e.printStackTrace();
        }finally {
            //luôn luôn chạy vào finally;
            System.out.println("Finally");
        }

    }
}
