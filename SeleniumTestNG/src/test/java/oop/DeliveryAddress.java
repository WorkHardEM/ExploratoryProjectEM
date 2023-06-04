package oop;

public class DeliveryAddress {

    private int id;
    private String country;
    private String city;
    private String street;
    private String building;
    private String zipCode;
    private String room;

    public DeliveryAddress(String country, String city, String street, String building, String zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.zipCode = zipCode;
    }
}
