package com.thoughtworks;

import com.thoughtworks.menu.*;

import java.io.IOException;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {


    public static void main(String[] args) throws IOException {

        System.out.println(" ** Welcome to Biblioteca **");

        int QUIT_OPTION=11;

        Library books = new Library();
        Library movies = new Library();

        books.items.add(new Books("Head First Java", "Bert Bates", 2004, true));
        books.items.add(new Books("Let us C", "Yashwanth Kanetkar", 2003, true));
        books.items.add(new Books("Let us C++", "Yashwanth Kanetkar", 2010, true));
        books.items.add(new Books("Complete Reference", "Herbert Schildt", 2011, true));

        movies.items.add(new Movies("Lagaan", 2001, "Asuthosh", 7, true));
        movies.items.add(new Movies("Golmal", 2010, "Rohit Shetty", 4, true));
        movies.items.add(new Movies("Krish", 2013, "Rakesh Roshan", 10, true));


        List<Action> menuActions = asList(
                 new ListBooks(books),
                 new ListMovies(movies),
                 new LoginActions()
        );

        while (true) {

            int optionChosen = Menu.showMenu();

            if(optionChosen==QUIT_OPTION) {
                System.out.println("You chose to quit the Biblioteca");
                return;
            }
            else if(optionChosen<1||optionChosen>11)
                System.out.println("Select a valid option!");

            for (Action menuAction : menuActions) {
                if (menuAction.canHandle(optionChosen)) {
                    menuAction.handle(optionChosen);
                }
            }
        }
    }
}
