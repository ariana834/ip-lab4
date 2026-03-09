package clase.fara.AI;

public class CashPayment extends Payment{
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public boolean confirmPayment() {
        System.out.println("Payment of " + amount + " confirmed with cash.");
        return true;
    }
}
