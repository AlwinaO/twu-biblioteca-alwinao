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
        System.out.println("3 - Check in a book");
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
                    String name = app.enterTitle();
                    app.checkoutBook(name);
                    break;
                case 3:
                    String returnBookName = app.enterTitle();
                    app.checkinBook(returnBookName);
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

    public String enterTitle() {
        System.out.println("Please enter name of book to checkin or checkout a book");
        Scanner scanner = new Scanner(System.in);
        String  name = scanner.nextLine();
        return name;
    }

    public void checkoutBook(String name) {
        for (Book book : books) {
            if(book.getName().equalsIgnoreCase(name) && book.isAvailable()){
                System.out.println("Checking out: " + book.getName());
                book.checkout();
                System.out.println("Thank you! Enjoy the book.");
                return;
            }
        }
        System.out.println("Sorry " + name + " is not available.");
    }

    public void checkinBook(String name) {
        for (Book book : books) {
            if(book.getName().equalsIgnoreCase(name) && !book.isAvailable()){
                System.out.println("Checking in: " + book.getName());
                book.checkin();
                System.out.println("Thank you! Enjoy the book.");
                return;
            }
        }
        System.out.println("That is not a valid book to return.");
    }

//    public void checkinBook() {
//        System.out.println("What book would you like to return? ");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        for (Book book : books) {
//
//            if (book.getName().equalsIgnoreCase(name) && !book.isAvailable()) {
//                System.out.println("Checking in: " + book.getName());
//                book.checkin();
//                System.out.println("Thank you for returning the book.");
//                return;
//            }
//            else
//                System.out.println("Sorry " + book.getName() + " is not available.");
//        }
//    }


    public void addBook() {

    }
}

//if(book.getName().equalsIgnoreCase(name) && !book.isAvailable()){
//        System.out.println("Checking in: " + book.getName());
//        book.checkin();
//        System.out.println("Thank you for returning the book.");
//        }