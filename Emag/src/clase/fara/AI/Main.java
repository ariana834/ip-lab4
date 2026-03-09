package clase.fara.AI;
public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(1);
        Product produs1 = new Product(01,"Calculator", 350.5);
        produs1.updateStock(150);
        produs1.setCategory("IT");
        Product produs2 = new Product(02,"Aspirator", 250.99, 103, "Electrocasnice");
        Product produs3 = new Product(03,"Minge de fotbal", 99.99, 400, "Sport");
        Product produs4 = new Product(04,"Scaun de birou", 199.99);
        produs4.updateStock(500);

        cart.addProduct(produs1);
        cart.addProduct(produs2);
        cart.addProduct(produs3);
        cart.addProduct(produs4);

        cart.removeProduct(produs2);

        cart.printProducts();
        //cart.calculateTotal();

        Order order = new Order(001, cart);
        order.calculateTotal();
        System.out.println("Totalul cosului de cumparaturi este: " + order.getTotalPrice());
        order.confirmOrder();
        Payment payment = new CardPayment(order.getTotalPrice());
        payment.confirmPayment();


    }
}