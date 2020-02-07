package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore!");

        System.out.println();

        ArrayList<Book> books = new ArrayList<Book>();
        populateBooks(books);

//        list out menu options
        System.out.println("Menu: ");

        System.out.println("1 - List of Books");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please select an option");
            int option = scanner.nextInt();  // Read user input
            System.out.println("Option: " + option);
            switch(option) {
                case 1:
                    displayBooks(books);
                    break;
                case 0:
                    exit(0);
                    break;
                default:
                    System.out.println("Please select a valid option!");
                    break;
            }
        }
    }

    private static void displayBooks(ArrayList<Book> books) {

        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void populateBooks(ArrayList<Book> books) {
        Book goneWithWind = new Book("Gone With The Wind", "Margaret Mitchell", 1936);
        books.add(goneWithWind);

        Book mockingbird = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        books.add(mockingbird);

        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        books.add(hobbit);

        Book wizardOfOz = new Book("The Wonderful Wizard of Oz", "L. Frank Baum", 1900);
        books.add(wizardOfOz);
    }

//    private static void printMenu(ArrayList<String> menu) {
//
//    }
}
