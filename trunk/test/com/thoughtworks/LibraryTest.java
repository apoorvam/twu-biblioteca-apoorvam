package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {


    Library booksT=new Library();    //one of the instances of Library to separate books and movies
    Login login=new Login();

    public void initialize()
    {
        login.loginForTest();
        booksT.items.add(new Books("Head First Java", "Bert Bates", 2004, true));
        booksT.items.add(new Books("Let us C", "Yashwanth Kanetkar", 2003, true));
        booksT.items.add(new Books("Let us C++", "Yashwanth Kanetkar", 2010, true));
        booksT.items.add(new Books("Complete Reference", "Herbert Schildt", 2011, true));
    }
    public void initializeList()
    {
        booksT.items.add(new Books("Head First Java", "Bert Bates", 2004, true));
        booksT.items.add(new Books("Let us C", "Yashwanth Kanetkar", 2003, true));
        booksT.items.add(new Books("Let us C++", "Yashwanth Kanetkar", 2010, true));
        booksT.items.add(new Books("Complete Reference", "Herbert Schildt", 2011, true));
    }

    @Test
    public void returnBook() throws Exception {
        initialize();
        booksT.checkoutItem("Head First Java");
        int result = booksT.returnItem("Head First Java");
        assertEquals(0,result);
    }

    @Test
    public void returnBookInsensitiveCase() throws Exception {
        initialize();
        booksT.checkoutItem("Head First Java");
        int result = booksT.returnItem("head first java");
        assertEquals(0, result);
    }

    @Test
    public void returnBookSpaces() throws Exception {
        initialize();
        booksT.checkoutItem("Head First Java");
        int result = booksT.returnItem("head first  java");
        assertEquals(1, result);
    }

    @Test
    public void returnInvalidBookBook() throws Exception {
        initialize();
        int result = booksT.returnItem("Tail First Java");
        assertEquals(1, result);
    }

    @Test
    public void returnAvailableBook() throws Exception {
        initialize();
        int result = booksT.returnItem("Head First Java");
        assertEquals(1, result);
    }

    @Test
    public void listAllAvailableBooksTest() throws Exception{
        initializeList();
        assertEquals(4, booksT.listAvailableBooks());
    }
    @Test
    public void listAllAvailableBooksWithABookAdded() throws Exception{
        initializeList();
        booksT.items.add(new Books("Wings of Fire", "Abdul Kalam", 2004, true));
        assertEquals(5, booksT.listAvailableBooks());
    }
    @Test
    public void listAllAvailableBooksWithABookMadeUnavailable() throws Exception{
        initializeList();
        booksT.items.add(new Books("2 States", "Chethan Bhagat", 2004, false));
        assertEquals(4, booksT.listAvailableBooks());

    }
    @Test
    public void listAllBooks() throws Exception{
        initializeList();
        assertEquals(4,booksT.listAllBooks());
    }
    @Test
    public void listAllBooksWithNewBookAdded() throws Exception{
        initializeList();
        booksT.items.add(new Books("Wings of Fire", "Abdul Kalam", 2004, true));
        assertEquals(5, booksT.listAllBooks());
    }
    @Test
    public void checkoutValidBook() throws Exception{
        initialize();
        assertEquals(0, booksT.checkoutItem("Head First Java"));
    }
    @Test
    public void checkoutValidBookButWithSpaces() throws Exception{
        initialize();
        assertEquals(1, booksT.checkoutItem("Head   First Java"));
    }
    @Test
    public void checkoutValidBookButWithCases() throws Exception{
        initialize();
        assertEquals(0,booksT.checkoutItem("HEAD First Java"));
    }
    @Test
    public void checkoutInvalidBook() throws Exception{
        initialize();
        assertEquals(1, booksT.checkoutItem("Tail First Java"));
    }

}