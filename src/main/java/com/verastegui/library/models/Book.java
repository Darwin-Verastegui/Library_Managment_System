package com.verastegui.library.models;

public class Book {
    private String name;
    private String author;
    private float price;

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    
    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }
    
    @Override
    public String toString() {
        return "Book name: " + this.name + " - Author: " + this.author + " - price -> " + this.price + "$";
    }
}