package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void shouldCheckoutBook() {
        BibliotecaApp app = new BibliotecaApp();

        app.populateBooks();

        assertEquals(4, app.getAvailableBooks().size());
        app.checkoutBook("Gone With The Wind");
        assertEquals(3, app.getAvailableBooks().size());
        assertEquals(1, app.checkedOutItems.size());
    }

    @Test
    public void shouldCheckInBook() {
        BibliotecaApp app = new BibliotecaApp();

        app.populateBooks();

        app.checkoutBook("Gone With The Wind");
        assertEquals(1, app.checkedOutItems.size());
        app.checkinBook("Gone With The Wind");
        assertEquals(0, app.checkedOutItems.size());
    }
}
