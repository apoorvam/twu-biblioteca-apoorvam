package com.thoughtworks.menu;

import com.thoughtworks.InputOutputStatements;
import com.thoughtworks.Library;

import java.io.IOException;

/**
 * Created by apoorvam on 8/1/14.
 */
public class ReturnMovies implements Action{
    Library movies;
    private InputOutputStatements ioStatements=new InputOutputStatements();
    public ReturnMovies(Library moviesList) {
        movies=moviesList;
    }

    @Override
    public boolean canHandle(int option) {
        return 6==option;
    }

    @Override
    public void handle(int option) throws IOException {
        ioStatements.outputForReturn(movies.returnItem(ioStatements.inputForReturn("movie")), "movie");
    }
}
