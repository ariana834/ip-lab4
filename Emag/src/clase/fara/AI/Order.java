package clase.fara.AI;

public class Order {
    private int id;
    private Cart cart;
    private String status;
    private double totalPrice;
    private Payment payment;
    public Order(int id, Cart cart)
    {
        this.id = id;
        this.cart = cart;
        this.status = "Pending";
        calculateTotal();
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void calculateTotal()
    {
        double total = 0;
        for(Product product : cart.getProducts())
        {
            total += product.getPrice();
        }
        this.totalPrice = total;

    }
    public void confirmOrder()
    {
        this.status = "Confirmed";
    }
    public int getId() {
        return id;
    }

    public Cart getCart() {
        return cart;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}