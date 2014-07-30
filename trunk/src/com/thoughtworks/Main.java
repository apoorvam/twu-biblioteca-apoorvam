package com.thoughtworks;

import com.thoughtworks.menu.Action;
import com.thoughtworks.menu.ListAllBooks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(" ** Welcome to Biblioteca **");

        Library books = new Library();
        Library movies = new Library();

        books.items.add(new Books("Head First Java", "Bert Bates", 2004, true));
        books.items.add(new Books("Let us C", "Yashwanth Kanetkar", 2003, true));
        books.items.add(new Books("Let us C++", "Yashwanth Kanetkar", 2010, true));
        books.items.add(new Books("Complete Reference", "Herbert Schildt", 2011, true));

        movies.items.add(new Movies("Lagaan", 2001, "Asuthosh", 7, true));
        movies.items.add(new Movies("Golmal", 2010, "Rohit Shetty", 4, true));
        movies.items.add(new Movies("Krish", 2013, "Rakesh Roshan", 10, true));


        List<Action> menuActions = asList((Action) new ListAllBooks(books));

        while (true) {

            int optionChosen = Menu.showMenu();

            for (Action menuAction : menuActions) {
                if (menuAction.canHandle(optionChosen)) {
                    menuAction.handle(optionChosen);
                }
            }

            switch (optionChosen) {
                case 1:
                    books.listAllBooks();
                    break;
                case 2:
                    movies.listAllMovies();
                    break;
                case 3:
                    books.listAvailableBooks();
                    outputForCheckout(books.checkoutItem(inputForCheckout("book")), "book");
                    break;
                case 4:
                    movies.listAvailableMovies();
                    outputForCheckout(movies.checkoutItem(inputForCheckout("movie")), "movie");
                    break;
                case 5://return a book
                    outputForReturn(books.returnItem(inputForReturn("book")), "book");
                    break;
                case 6:// return movie
                    outputForReturn(movies.returnItem(inputForReturn("movie")), "movie");
                    break;
                case 7:
                    login.allowUserToLogin();
                    break;
                case 8:
                    login.showUserInfo();
                    break;
                case 9:
                    login.showLogBook();
                    break;
                case 10:
                    login.logout();
                    break;
                case 11:
                    System.out.println("You chose to quit the Biblioteca");
                    return;
                default:
                    System.out.println("Select a valid option!");
            }
        }

    }


    private static void outputForReturn(int returnValue, String item) {
        if (returnValue == 0)
            System.out.println("Thank you for returning the " + item);
        else if (returnValue == 1)
            System.out.println("This is not a valid " + item + " to return");
        else if (returnValue == 2)
            System.out.println("Login to perform this action");
    }

    private static String inputForCheckout(String item) throws IOException {
        System.out.println("Enter the " + item + " name to be checked out:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static String inputForReturn(String item) throws IOException {
        System.out.println("Enter the " + item + " name to be returned:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static void outputForCheckout(int returnValue, String item) {
        if (returnValue == 0)
            System.out.println("Thank you! Enjoy the " + item);
        else if (returnValue == 1)
            System.out.println("That " + item + " is not available");
        else if (returnValue == 2)
            System.out.println("Login to perform this action");
    }


}
