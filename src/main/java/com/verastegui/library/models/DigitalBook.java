package com.verastegui.library.models;

public class DigitalBook extends Book {
    private String format;

    public DigitalBook(String name, String author, float price, String format) {
        super(name, author, price);
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }

    @Override
    public String toString() {
        return super.toString() + " - Format: " + this.format;
    }
}