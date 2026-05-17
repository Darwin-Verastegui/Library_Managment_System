package com.verastegui.library;

import java.util.ArrayList;
import java.util.Scanner;

import com.verastegui.library.models.Book;
import com.verastegui.library.models.DigitalBook;
import com.verastegui.library.models.PhysicalBook;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) { 
            System.out.println("Plase choose an option: \n1. Add book \n2. Show books \n3. Exit");
            String userAction = sc.nextLine();

            switch (userAction) {
                case "1":
                    System.out.println("Is the book digital or physical? (d/p)");
                    String bookType = sc.nextLine();

                    if (bookType.equalsIgnoreCase("d")) {
                        System.out.println("Enter the book name: ");
                        String name = sc.nextLine();

                        System.out.println("Enter the book author: ");
                        String author = sc.nextLine();

                        System.out.println("Enter the book price: ");
                        float price = sc.nextFloat();
                        sc.nextLine();

                        System.out.println("Enter the book format (e.g., PDF, EPUB): ");
                        String format = sc.nextLine();

                        Book digitalBook = new DigitalBook(name, author, price, format);
                        books.add(digitalBook);

                        System.out.println("Digital book added successfully!");
                    } else if (bookType.equalsIgnoreCase("p")) {

                        System.out.println("Enter the book name: ");
                        String name = sc.nextLine();

                        System.out.println("Enter the book author: ");
                        String author = sc.nextLine();

                        System.out.println("Enter the book price: ");
                        float price = sc.nextFloat();
                        sc.nextLine();

                        System.out.println("Enter the book cover type (e.g., Hardcover, Paperback): ");
                        String coverType = sc.nextLine();

                        Book physicalBook = new PhysicalBook(name, author, price, coverType);
                        books.add(physicalBook);

                        System.out.println("Physical book added successfully!");
                    }
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