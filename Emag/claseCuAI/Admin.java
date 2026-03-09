package emag;

public class Admin extends Client {

    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void addProduct(Product product) {
        System.out.println("Adminul " + this.getName() + " a adaugat in sistem produsul: " + product.getName());
    }

    public void editProduct(Product product) {
        System.out.println("Adminul " + this.getName() + " a editat detaliile produsului: " + product.getName());
    }

    public void deleteProduct(Product product) {
        System.out.println("Adminul " + this.getName() + " a sters produsul: " + product.getName());
    }

    public void manageUsers() {
        System.out.println("Adminul " + this.getName() + " gestioneaza drepturile si conturile utilizatorilor.");
    }

    public void manageReview() {
        System.out.println("Adminul " + this.getName() + " modereaza recenziile necorespunzatoare.");
    }
}