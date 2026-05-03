package com.verastegui.library;

import java.util.Scanner;
import com.verastegui.library.models.Book;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[10];
        Book book = new Book();
        int bkIndx = 0;

        while (true) { 
            System.out.println("Plase choose an option: \n1. Add book \n2. Show books \n3. Exit");
            String userAction = sc.nextLine();

            switch (userAction) {
            
                case "1":
                    System.out.println("Enter the book name: ");
                    String name = sc.nextLine();
                    book.setName(name);

                    System.out.println("Enter the book author: ");
                    String author = sc.nextLine();
                    book.setAuthor(author);

                    System.out.println("Enter the book price: ");
                    float price = sc.nextFloat();
                    sc.nextLine();
                    book.setPrice(price);

                    for (int i = 0; i < books.length; i++) {
                        if (books[bkIndx] == null) {
                            books[bkIndx] = book;
                            bkIndx++;
                            break;
                        }
                    }
                    
                    break;
                case "2":
                    for (int i = 0; i < books.length; i++) {
                        if (books[i] != null) {
                            System.out.println(books[i].toString());
                        }

                    }
                    
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