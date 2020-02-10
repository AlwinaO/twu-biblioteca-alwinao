package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class BibliotecaApp {

    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Movie> movies = new ArrayList<Movie>();


    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore!");

        System.out.println();

        BibliotecaApp app = new BibliotecaApp();

        app.populateBooks();
        app.populateMovies();

//        list out menu options
        System.out.println("Menu: ");

        app.displayMenu();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please select an option");
            int option = scanner.nextInt();  // Read user input
            System.out.println("Option: " + option);
            switch (option) {
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
                case 4:
                    app.displayMovies();
                    break;
                case 5:
                    String movieName = app.enterTitle();
                    app.checkoutMovie(movieName);
                    break;
                case 6:
                    String returnMovieName = app.enterTitle();
                    app.checkinMovie(returnMovieName);
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
            if (book.isAvailable()) {
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
        System.out.println("Please enter name of item to checkin or checkout.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    public void checkoutBook(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name) && book.isAvailable()) {
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
            if (book.getName().equalsIgnoreCase(name) && !book.isAvailable()) {
                System.out.println("Checking in: " + book.getName());
                book.checkin();
                System.out.println("Thank you for returning the book.");
                return;
            }
        }
        System.out.println("That is not a valid book to return.");
    }

    public void displayMovies() {
        for (Movie movie : getAvailableMovies()) {
            System.out.println(movie);
        }
    }

    public ArrayList<Movie> getAvailableMovies() {
        ArrayList<Movie> availableMovies = new ArrayList<Movie>();

        for (Movie movie : movies) {
            if (movie.isAvailable()) {
                availableMovies.add(movie);
            }
        }
        return availableMovies;
    }

    public void populateMovies() {
        Movie fastAndFurious = new Movie("Fast and Furious", 2001, "Rob Cohen", "9");
        movies.add(fastAndFurious);

        Movie speed = new Movie("Speed", 1995, "Jan de Bont", "8");
        movies.add(speed);

        Movie badBoys3 = new Movie("Bad Boys 3", 2020, "Adil El Arbi", "10");
        movies.add(badBoys3);

        Movie blackPanther = new Movie("Black Panther", 2018, "Ryan Coogler", "9");
        movies.add(blackPanther);
    }

    public void checkoutMovie(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equalsIgnoreCase(name) && movie.isAvailable()) {
                System.out.println("Checking out: " + movie.getName());
                movie.checkout();
                System.out.println("Thank you! Enjoy the movie.");
                return;
            }
        }
        System.out.println("Sorry " + name + " is not available.");
    }

    public void checkinMovie(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equalsIgnoreCase(name) && !movie.isAvailable()) {
                System.out.println("Checking in: " + movie.getName());
                movie.checkin();
                System.out.println("Thank you for returning the movie.");
                return;
            }
        }
        System.out.println("That is not a valid movie to return.");
    }

    public void displayMenu(){
        System.out.println("1 - List of Books");
        System.out.println("2 - Check out a book");
        System.out.println("3 - Check in a book");
        System.out.println("4 - List of Movies");
        System.out.println("5 - Check out a movie");
        System.out.println("6 - Check in a movie");
        System.out.println("0 - Exit");
        System.out.println();
    }
}
