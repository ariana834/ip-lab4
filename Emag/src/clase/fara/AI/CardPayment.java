package clase.fara.AI;

public class CardPayment extends Payment{
    public CardPayment(double amount) {
        super(amount);
    }
    @Override
    public boolean confirmPayment() {
        System.out.println("Payment of " + amount + " confirmed with card.");
        return true;
    }
}