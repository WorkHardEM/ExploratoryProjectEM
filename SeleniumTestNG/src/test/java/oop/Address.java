package oop;

public class Address {

    private int id;
    private String country;
    private String city;
    private String street;
    private String building;
    private String zipCode;
    private String room;

    public Address(String country, String city, String street, String building, String zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getRoom() {
        return room;
    }
}
