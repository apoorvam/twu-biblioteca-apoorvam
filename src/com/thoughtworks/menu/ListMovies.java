package com.thoughtworks.menu;

import com.thoughtworks.InputOutputStatements;
import com.thoughtworks.Library;
import com.thoughtworks.Login;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by apoorvam on 8/1/14.
 */
public class ListMovies implements Action {
    Library movies;
    public ListMovies(Library moviesList) {
        movies=moviesList;
    }

    private InputOutputStatements ioStatements = new InputOutputStatements();

    @Override
    public boolean canHandle(int option) {
        return Arrays.asList(2,4,6).contains(option);
    }

    @Override
    public void handle(int option) throws IOException {
        if(option==2)
                movies.listAllMovies();
        else if(option==4){
            movies.listAvailableMovies();
            ioStatements.outputForCheckout(movies.checkoutItem(ioStatements.inputForCheckout("movie")), "movie");
        }
        else if(option==6){
            ioStatements.outputForReturn(movies.returnItem(ioStatements.inputForReturn("movie")), "movie");
        }
    }
}
