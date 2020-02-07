package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore!");

        System.out.println();

        ArrayList<Book> books = new ArrayList<Book>();

        populateBooks(books);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
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
}
