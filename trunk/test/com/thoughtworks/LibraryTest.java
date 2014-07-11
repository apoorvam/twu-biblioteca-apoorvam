package com.thoughtworks;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {


    @Test
    public void returnBook() throws Exception {
        Library library = new Library();
        library.checkoutBook("Head First Java");
        boolean result = library.returnBook("Head First Java");
        assertTrue(result);
    }

    @Test
    public void returnBookInsensitiveCase() throws Exception {
        Library library = new Library();
        library.checkoutBook("Head First Java");
        boolean result = library.returnBook("head first java");
        assertTrue(result);
    }

    @Test
    public void returnBookSpaces() throws Exception {
        Library library = new Library();
        library.checkoutBook("Head First Java");
        boolean result = library.returnBook("head first  java");
        assertFalse(result);
    }

    @Test
    public void returnInvalidBookBook() throws Exception {
        Library library = new Library();
        boolean result = library.returnBook("Tail First Java");
        assertFalse(result);
    }

    @Test
    public void returnAvailableBook() throws Exception {
        Library library = new Library();
        boolean result = library.returnBook("Head First Java");
        assertFalse(result);
    }

    @Test
    public void listAllAvailableBooksTest() throws Exception{
        Library library=new Library();
        assertEquals(4,library.listAllAvailableBooks());
    }
    @Test
    public void listAllAvailableBooksWithABookAdded() throws Exception{
        Library library=new Library();
        library.booksList.add(new Books("Wings of Fire", "Abdul Kalam", 2004, true));
        assertEquals(5, library.listAllAvailableBooks());
    }
    @Test
    public void listAllAvailableBooksWithABookMadeUnavailable() throws Exception{
        Library library=new Library();
        Books book=library.booksList.get(0);
        book.available=false;
        assertEquals(3,library.listAllAvailableBooks());

    }
    @Test
    public void listAllAvailableBooksWithAUnavailableBookAdded() throws Exception{
        Library library=new Library();
        library.booksList.add(new Books("Wings of Fire", "Abdul Kalam", 2004, false));
        assertEquals(4,library.listAllAvailableBooks());
    }
    @Test
    public void listAllBooks() throws Exception{
        Library library=new Library();
        assertEquals(4,library.listOfBooks());
    }
    @Test
    public void listAllBooksWithNewBookAdded() throws Exception{
        Library library=new Library();
        library.booksList.add(new Books("Wings of Fire", "Abdul Kalam", 2004, true));
        assertEquals(5,library.listOfBooks());
    }
    @Test
    public void checkoutValidBook() throws Exception{
        Library library=new Library();
        assertTrue(library.checkoutBook("Head First Java"));
    }
    @Test
    public void checkoutValidBookButWithSpaces() throws Exception{
        Library library=new Library();
        assertFalse(library.checkoutBook("Head   First Java"));
    }
    @Test
    public void checkoutValidBookButWithCases() throws Exception{
        Library library=new Library();
        assertTrue(library.checkoutBook("HEAD First Java"));
    }
    @Test
    public void checkoutInvalidBook() throws Exception{
        Library library=new Library();
        assertFalse(library.checkoutBook("Tail First Java"));
    }

}