package com.verastegui.library;

import java.util.ArrayList;
import java.util.Scanner;

import com.verastegui.library.models.Book;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) { 
            System.out.println("Plase choose an option: \n1. Add book \n2. Show books \n3. Exit");
            String userAction = sc.nextLine();

            switch (userAction) {
                case "1":
                    System.out.println("Enter the book name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter the book author: ");
                    String author = sc.nextLine();

                    System.out.println("Enter the book price: ");
                    float price = sc.nextFloat();
                    
                    Book book = new Book(name, author, price);
                    books.add(book);
                    System.out.println("Book added successfully!");
                    break;
                case "2":
                    for (Book bk : books) {
                        if (bk != null) {
                            System.out.println(bk.toString());
                        }
                    }
                    System.out.println("Books displayed successfully!");
                    break;
                case "3":
                    sc.close();
                    System.exit(0);
                default:
                    System.err.println("Invalid option, please try again.");
            }    
        }
    }
}