package clase.fara.AI;
import java.util.ArrayList;
import java.util.List;
public class Cart {
    private int id;
    private List<Product> products;
    public Cart(int id)
    {
        this.id = id;
        this.products= new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }
    public void removeProduct(Product product)
    {
        products.remove(product);
    }
    public void calculateTotal()
    {
        double total = 0;
        for(Product product : products)
        {
            total += product.getPrice();
        }
        System.out.println("Total: " + total);
    }
    public void printProducts(){
        for (Product product : products){
            System.out.println("Produs: " + product.getName() + ", Pret: " + product.getPrice() + ", Stoc: " + product.getStock());
        }
    }
}