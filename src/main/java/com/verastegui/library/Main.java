package com.verastegui.library;

import java.util.Scanner;
import com.verastegui.library.models.Book;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book1 = new Book();

        System.err.println("Enter the book name: ");
        book1.setName(sc.nextLine());
        System.err.println("Enter the book author: ");
        book1.setAuthor(sc.nextLine());
        System.err.println("Enter the book price: ");
        book1.setPrice(sc.nextFloat());

        System.out.println(book1.toString());
    }
}