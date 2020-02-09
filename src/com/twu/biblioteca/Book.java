package com.twu.biblioteca;


public class Book {

    private String name;
    private String author;
    private int year;
//    add boolean value to check if book is available
    private boolean available;

    public Book() {
    }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void checkout() {
        this.available = false;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkin() {
        this.available = true;
    }

    @Override
    public String toString() {
        return ("Book: "+ this.getName() + ", " +
                " Author: "+ this.getAuthor() + ", " +
                " Year: " + this.getYear());
    }

}

