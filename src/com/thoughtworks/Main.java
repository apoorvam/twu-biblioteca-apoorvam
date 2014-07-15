package com.thoughtworks;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int optionChosen=1;
        System.out.println("\n          ** Welcome to Biblioteca **");
        Menu menu = new Menu();
        int noOfBooks;
        Library library=new Library();
        MovieStore movie=new MovieStore();
        Login login=new Login();
        while(optionChosen!=9) {
            optionChosen = menu.showMenu();

            switch(optionChosen) {
                case 1:// list all books of library
                    library.listOfBooks();
                    break;
                case 2: //List all movies of library
                    movie.listAllMovies();
                    break;
                case 3://list available books
                       noOfBooks=library.listAllAvailableBooks();
                       library.checkOutBook();
                    break;
                case 4: // list available movies
                    movie.listAvailableMovies();
                    movie.checkoutMovie();
                    break;
                case 5://return a book
                    library.returnBook();
                    break;
                case 6:// return movie
                    movie.returnMovie();
                    break;
                case 7: //Login
                    login.allowUserToLogin();
                    break;
                case 8:// user information

                case 9:
                    System.out.println("You chose to quit the Biblioteca");
                    return;
                default:
                    System.out.println("Select a valid option!");
            }
        }

    }

}
