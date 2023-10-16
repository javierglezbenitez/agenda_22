package org.ulpgc.is1.model;

public class Addres {

    private String street;

    private int number;

    private int floor;

    private String city;

    public Addres(String street, int number, int floor, String city) {
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.city = city;

    }

    @Override
    public String toString() {
        return "Addres{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", floor=" + floor +
                ", city='" + city + '\'' +
                '}';
    }
}
