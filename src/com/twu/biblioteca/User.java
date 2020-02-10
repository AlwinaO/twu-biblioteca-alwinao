package com.twu.biblioteca;

public class User {

    private String libraryNumber;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean librarian;

    public User(String libraryNumber, String password, String name, String email, String phoneNumber, boolean librarian) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.librarian = false;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isLibrarian() {
        return librarian;
    }

//    @Override
//    public String toString() {
//        return ("Movie: "+ this.getName() + " | " +
//                " Director: "+ this.getDirector() + " | " +
//                " Year: " + this.getYear()) + " | " +
//                " Rating: " + this.getRating();
//    }
}
