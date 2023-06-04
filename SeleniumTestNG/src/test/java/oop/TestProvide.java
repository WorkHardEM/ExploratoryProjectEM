package oop;

public class TestProvide {
    public static void main(String[] args) {
        User oneUser = new User("first name", "last name", "full name", "email", "777");
        oneUser.setBillingAddress(new Address("country", "city", "street", "12", "0001"));
        oneUser.setDeliveryAddress(new Address("country", "city", "street", "12", "0001"));
    }
}
