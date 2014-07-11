package com.thoughtworks;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int optionChosen=1;
        System.out.println("\n          ** Welcome to Biblioteca **");
        Menu menu = new Menu();
        int noOfBooks;
        Library library=new Library();
        while(optionChosen!=4) {
            optionChosen = menu.showMenu();

            switch(optionChosen) {
                case 1://list books
                       noOfBooks=library.listAllAvailableBooks();
                       library.checkOutBook();
                    break;
                case 2://return a book
                    library.returnBook();
                    break;
                case 3:// list all books of library
                   library.listOfBooks();
                    break;
                case 4:
                    System.out.println("You chose to quit the Biblioteca");
                    return;
                default:
                    System.out.println("Select a valid option!");
            }
        }

    }

}
