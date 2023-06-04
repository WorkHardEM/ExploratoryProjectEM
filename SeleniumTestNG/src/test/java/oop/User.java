package oop;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumbers;

    private Address billingAddress;
    private Address deliveryAddress;

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }



    public User(String firstName, String lastName, String fullName, String email, String phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setBillingAddress(Address address) {
        this.billingAddress = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }
}
