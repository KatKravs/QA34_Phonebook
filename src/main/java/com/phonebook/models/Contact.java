package com.phonebook.models;

public class Contact {
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String adress;
    private String description;


    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }

    public Contact setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public Contact setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    public String getDescription() {
        return description;
    }
}
