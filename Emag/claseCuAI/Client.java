package emag;

public class Client {

    private int id;
    private String name;
    private String email;
    private String password;

    public Client(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean login() {
        System.out.println("Clientul " + this.name + " s-a autentificat cu succes");
        return true;
    }

    public void logout() {
        System.out.println("Clientul " + this.name + " s-a deconectat");
    }

    public void updateProfile() {
        System.out.println("Profilul clientului " + this.name + " a fost actualizat");
    }

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}