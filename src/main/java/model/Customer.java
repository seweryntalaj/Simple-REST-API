package model;

public class Customer {

    private int id;
    private String name;
    private String city;
    private String street;
    private String zipCode;

    public Customer() {}

    public Customer(int id, String name, String city, String street, String zipCode) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
