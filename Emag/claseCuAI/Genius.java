package emag;

import java.util.Date;

public class Genius extends User {

    private Date activationDate;
    private Date expirationDate;
    private boolean freeShipping;

    public Genius(int id, String name, String email, String password,
                  String deliveryAddress, String phoneNumber,
                  Date activationDate, Date expirationDate, boolean freeShipping) {

        super(id, name, email, password, deliveryAddress, phoneNumber);
        this.activationDate = activationDate;
        this.expirationDate = expirationDate;
        this.freeShipping = freeShipping;
    }

    public void checkDiscount() {
        System.out.println("Se verifica reducerile Genius pentru " + this.getName());
    }

    public void extendSubscription() {
        System.out.println("Abonamentul Genius al lui " + this.getName() + " a fost prelungit cu inca un an");
    }


    public Date getActivationDate() {
        return activationDate;
    }
    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isFreeShipping() {
        return freeShipping;
    }
    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }
}