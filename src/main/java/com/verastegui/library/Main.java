package com.verastegui.library;
import com.verastegui.library.models.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("One By One");
        book1.setAuthor("Chris Carter");
        book1.setPrice(12.22f);

        System.out.println(book1.toString());
    }
}