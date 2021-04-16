package java19.session7;

public class OutOfMoneyException extends Exception{
    public OutOfMoneyException() {
    }

    public OutOfMoneyException(String message) {
        super(message);
    }
}
