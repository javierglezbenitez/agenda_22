package org.ulpgc.is1.model;

public class Person extends Contact{

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, String email, String telephone, String street, int number, int floor, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAddres(street, number, floor, city);
        setEmail(email);
        setTelephone(telephone);
    }



}
