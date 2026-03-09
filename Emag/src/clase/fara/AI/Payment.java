package clase.fara.AI;

public abstract class Payment {
    protected double amount;
    public Payment(double amount){
        this.amount = amount;
    }
    public abstract boolean confirmPayment();
}