package emag;

import java.util.ArrayList;
import java.util.List;

public abstract class User extends Client {

    private String deliveryAddress;
    private String phoneNumber;
    private Cart cart;
    private List<Order> orders;

    public User(int id, String name, String email, String password, String deliveryAddress, String phoneNumber) {
        super(id, name, email, password);
        this.deliveryAddress = deliveryAddress;
        this.phoneNumber = phoneNumber;
        this.cart = new Cart(id);
        this.orders = new ArrayList<>();
    }

    public void addToCart(Product product) {
        if (this.cart != null) {
            this.cart.addProduct(product);
            System.out.println("Produsul '" + product.getName() + "' a fost adaugat in cosul lui " + this.getName());
        }
    }

    public void addToFavorites(Product product) {
        System.out.println("Produsul '" + product.getName() + "' a fost salvat la favorite de " + this.getName());
    }

    public Order placeTheOrder() {
        Order newOrder = new Order(this.getId(), this.cart);
        this.orders.add(newOrder);
        System.out.println("Comanda a fost plasata cu succes de catre " + this.getName() + ". Total de plata: " + newOrder.getTotalPrice());
        return newOrder;
    }

    public void leaveReview(Product product, int rating) {
        System.out.println(this.getName() + " a lasat un review de " + rating + " stele pentru produsul '" + product.getName());
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
