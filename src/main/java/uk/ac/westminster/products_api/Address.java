package uk.ac.westminster.products_api;

public class Address {
    private String address;
    private String city;
    private String postcode;

    public Address() {}

    public Address(String address, String city, String postcode) {
        this.address = address;
        this.city = city;
        this.postcode = postcode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}
