package com.aws.codewhsiperdemo.dto;

//create a Product class with id, name, price, description and rating properties.
public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private double rating;

    public Product(int id, String name, double price, String description, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {                 
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }   
}    
