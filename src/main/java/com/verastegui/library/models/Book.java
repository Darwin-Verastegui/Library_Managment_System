package com.verastegui.library.models;

import java.time.LocalDate;

public class Book {
    private String name;
    private String author;
    private float price;
    private LocalDate addedDate;

    public Book(String name, String author, float price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.addedDate = LocalDate.now();
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

    public LocalDate getAddedDate() {
        return this.addedDate;
    }
    
    @Override
    public String toString() {
        return "Book name: " + this.name + " - Author: " + this.author + " - price => " + this.price + "$" + " - added date: " + this.addedDate;
    }
}