package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class BibliotecaApp {

    ArrayList<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore!");

        System.out.println();

        BibliotecaApp app = new BibliotecaApp();

        app.populateBooks();

//        list out menu options
        System.out.println("Menu: ");

        System.out.println("1 - List of Books");
        System.out.println("2 - Check out a book");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please select an option");
            int option = scanner.nextInt();  // Read user input
            System.out.println("Option: " + option);
            switch(option) {
                case 1:
                    app.displayBooks();
                    break;
                case 2:
                    app.enterTitle();
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

    public void displayBooks() {


        for (Book book : getAvailableBooks()) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<Book>();

        for (Book book : books) {
            if(book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public void populateBooks() {
        Book goneWithWind = new Book("Gone With The Wind", "Margaret Mitchell", 1936);
        books.add(goneWithWind);

        Book mockingbird = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        books.add(mockingbird);

        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        books.add(hobbit);

        Book wizardOfOz = new Book("The Wonderful Wizard of Oz", "L. Frank Baum", 1900);
        books.add(wizardOfOz);
    }

    public void enterTitle() {
//        check if book is in list, if yes, then remove, else provide error
        
        System.out.println("Please enter name of book to check out a book");
        Scanner scanner = new Scanner(System.in);
        String  name = scanner.nextLine();

        checkoutBook(name);

    }

    public void checkoutBook(String name) {
        for (Book book : books) {
            if(book.getName().equals(name)){
            System.out.println("Checking out: " + book.getName());
            book.checkout();
            }
        }
    }
}
