package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Library {
    //public List<Movies> movieList = new ArrayList<Movies>();
    public List<Item> items = new ArrayList<Item>();
    Login login = new Login();
    Log log=new Log();
    int res=1;

    //public List<Lendable> booksAndMovies;

    public int listAvailableBooks() {
        int counter = 1;
        System.out.format("Sl.No%15s%30s%30s", "Title", "Author", "Publication Year");
        System.out.println("\n-------------------------------------------------------------------------------------");
        for (Item item : items) {
            if (item.checkAvailability()) {
                item.printWithoutAvailability(counter++);
            }
        }
        System.out.println("---------------------------------------------------------------------------------------");
        return counter - 1;
    }
    public int listAvailableMovies() {
        int counter = 1;
        System.out.format("Sl.No%15s%25s%25s%15s", "MovieName", "Year", "Director", "Rating");
        System.out.println("\n-------------------------------------------------------------------------------------");
        for (Item item : items) {
            if (item.checkAvailability()) {
                item.printWithoutAvailability(counter++);
            }
        }
        System.out.println("---------------------------------------------------------------------------------------");
        return counter-1;
    }

    /*public int checkOutBook() throws IOException {
        if (checkoutBook(bookToBeCheckedOut)) {
            System.out.println("Thank you! Enjoy the book");
            return 1;
        } else {
            System.out.println("That book is not available");
            return 0;
        }
    }*/

    /*public int checkoutMovie() throws IOException {
        System.out.println("Enter the movie name to be checked out:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        if (checkoutMovie(name)) {
            System.out.println("Thank you! Enjoy the Movie");
            return 1;
        }
        else {
            System.out.println("That movie is not available");
            return 0;
        }
    }*/

    public int checkoutItem(String itemToBeCheckedOut) throws IOException {
        if ((res=login.allowUserToLogin())== 0) {
            for (Item bookInLibrary : items) {
                if (bookInLibrary.matchesForCheckout(itemToBeCheckedOut)) {
                    bookInLibrary.checkoutItem();
                    log.makeEntry(itemToBeCheckedOut, login.currentUserId);
                    return 0;
                }
            }
            return 1;
        }
        return res;
    }

    /*public int checkoutMovie(String itemToBeCheckedOut) {
        for (Item movieInLibrary : items) {
            if (movieInLibrary.matchesForCheckout(itemToBeCheckedOut)) {
                while((res=login.allowUserToLogin())==0) {
                    movieInLibrary.checkoutItem();
                    return 0;
                }
            }
        }
        return res;
    }*/

    /*public int returnBook() throws IOException {
        System.out.println("Enter the book title to be returned.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bookToBeReturned = br.readLine();
        if (returnBook(bookToBeReturned)) {
            System.out.println("Thank you for returning the book");
            return 1;
        } else {
            System.out.println("This is not a valid book to return");
            return 0;
        }

    }
    public int returnMovie() throws IOException {
        System.out.println("Enter the movie name to be returned.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        if (returnMovie(name)) {
            System.out.println("Thank you for returning the movie");
            return 1;
        }
        else {
            System.out.println("This is not a valid movie to return");
            return 0;
        }
    }*/

    public int returnItem(String itemToBeReturned) {
        if((res=login.allowUserToLogin())==0) {
            for (Item s : items) {
                if (s.matchesForReturn(itemToBeReturned)) {
                    log.removeEntry(itemToBeReturned, login.currentUserId);
                    s.returnItem();
                    return 0;
                }
            }
            return 1;
        }
        return res;
    }
/*
    public int returnMovie(String itemToBeReturned) {
        if((res=login.allowUserToLogin())==0) {
            for (Item s : items) {
                if (s.matchesForReturn(itemToBeReturned)) {
                    s.returnItem();
                    return 0;
                }
            }
            return 1;
        }
        return res;
    }
*/
    public int listAllBooks() {
        int counter = 1;
        System.out.format("Sl.No%15s%30s%30s%20s", "Title", "Author", "Publication Year", "Availability");
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        for (Item item : items)
            item.printWithAvailability(counter++);
        System.out.println("------------------------------------------------------------------------------------------------------");
        return counter-1;
    }
    public int listAllMovies() {
        int counter = 1;
        System.out.format("Sl.No%15s%25s%25s%15s%25s", "MovieName", "Year", "Director", "Rating", "Availability");
        System.out.println("\n------------------------------------------------------------------------------------------------------------");
        for (Item item : items) {
            item.printWithAvailability(counter++);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        return counter - 1;
    }
}
