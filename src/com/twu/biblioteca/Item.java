package com.twu.biblioteca;

abstract class Item {

    protected String name;
    protected int year;
    protected boolean available;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
