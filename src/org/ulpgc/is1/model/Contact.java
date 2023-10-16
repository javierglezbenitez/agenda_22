package org.ulpgc.is1.model;
import java.util.List;

public abstract class Contact {

    private String telephone;

    private String email;


    private Addres addres;

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddres(String street, int number, int floor, String city) {
        this.addres = new Addres(street, number, floor, city);
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public Addres getAddres() {
        return addres;
    }
}
