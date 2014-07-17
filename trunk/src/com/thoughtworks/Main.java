package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int optionChosen=1;
        System.out.println("\n          ** Welcome to Biblioteca **");
        Menu menu = new Menu();
        int noOfBooks;
        Library books=new Library();    //2 instances of Library to separate books and movies
        Library movies=new Library();
        books.items.add(new Books("Head First Java", "Bert Bates", 2004, true));
        books.items.add(new Books("Let us C", "Yashwanth Kanetkar", 2003, true));
        books.items.add(new Books("Let us C++", "Yashwanth Kanetkar", 2010, true));
        books.items.add(new Books("Complete Reference", "Herbert Schildt", 2011, true));

        movies.items.add(new Movies("Lagaan",2001,"Asuthosh",7,true));
        movies.items.add(new Movies("Golmal", 2010, "Rohit Shetty", 4, true));
        movies.items.add(new Movies("Krish", 2013, "Rakesh Roshan", 10, true));

        Login login=new Login();
        String name;
        int returnValue;
        while(optionChosen!=11) {
            optionChosen = menu.showMenu();

            switch(optionChosen) {
                case 1:// list all books of library
                    books.listAllBooks();
                    break;
                case 2: //List all movies of library
                    movies.listAllMovies();
                    break;
                case 3://list available books
                    books.listAvailableBooks();
                    name=inputForCheckout("book");
                    returnValue=books.checkoutItem(name);
                    outputForCheckout(returnValue,"book");
                    break;
                case 4: // list available movies
                    movies.listAvailableMovies();
                    name=inputForCheckout("movie");
                    returnValue=movies.checkoutItem(name);
                    outputForCheckout(returnValue, "movie");
                    break;
                case 5://return a book
                    name=inputForReturn("book");
                    returnValue=books.returnItem(name);
                    outputForReturn(returnValue,"book");
                    break;
                case 6:// return movie
                    name=inputForReturn("movie");
                    returnValue=movies.returnItem(name);
                    outputForReturn(returnValue, "movie");
                    break;
                case 7: //Login
                    login.allowUserToLogin();
                    break;
                case 8:// user information
                    login.showUserInfo();
                    break;
                case 9:// Log book
                    login.showLogBook();
                    break;
                case 10:// Logout
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
        if(returnValue==0)
            System.out.println("Thank you for returning the "+item);
        else if(returnValue==1)
            System.out.println("This is not a valid "+item+" to return");
        else if(returnValue==2)
            System.out.println("Login to perform this action");
    }

    private static String inputForCheckout(String item) throws IOException {
        System.out.println("Enter the "+item+" name to be checked out:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bookName = br.readLine();
        return bookName;
    }
    private static String inputForReturn(String item) throws IOException {
        System.out.println("Enter the "+item+" name to be returned:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        return name;
    }
    private static void outputForCheckout(int returnValue, String item) {
        if(returnValue==0)
            System.out.println("Thank you! Enjoy the "+item);
        else if(returnValue==1)
            System.out.println("That "+item+" is not available");
        else if(returnValue==2)
            System.out.println("Login to perform this action");
    }


}
