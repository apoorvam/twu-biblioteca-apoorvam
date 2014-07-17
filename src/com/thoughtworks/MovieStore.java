/*package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;*/

/**
 * Created by apoorvam on 7/15/14.
 */
/*
public class MovieStore {
    public List<Movies> movieList = new ArrayList<Movies>();

    MovieStore()
    {
        movieList.add(new Movies("Lagaan",2001,"Asuthosh",7,true));
        movieList.add(new Movies("Golmal",2010,"Rohit Shetty",4,true));
        movieList.add(new Movies("Krish",2013,"Rakesh Roshan",10,true));
    }

    public void checkoutMovie() throws IOException {
        System.out.println("Enter the movie name to be checked out:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        if (checkoutMovie(name))
        {
            System.out.println("Thank you! Enjoy the Movie");
        }
        else
            System.out.println("That movie is not available");
    }

    boolean checkoutMovie(String name) {
        Login login=new Login();
        for (Movies movie : movieList) {
            if (name.equalsIgnoreCase(movie.movieName) && movie.available) {
                while(login.allowUserToLogin()==0) {
                    movie.available = false;
                    return true;
                }
            }
        }
        return false;
    }

    public int listAvailableMovies() {
        int counter = 1;
        System.out.println("Movie list with details:");
        System.out.format("Sl.No%15s%25s%25s%15s", "MovieName", "Year", "Director", "Rating");
        System.out.println("\n-------------------------------------------------------------------------------------");
        for (Movies movie : movieList) {
            if (movie.available == true) {
                movie.print(counter++);
            }
        }
        System.out.println("-------------------------------------------------------------------------------------");
        return counter-1;
    }

    public int listAllMovies() {
        int counter = 1;
        System.out.println("Movie list with details:");
        System.out.format("Sl.No%15s%25s%25s%15s%25s", "MovieName", "Year", "Director", "Rating","Availability");
        System.out.println("\n------------------------------------------------------------------------------------------------------------");
        for (Movies movie : movieList) {
                System.out.format((counter++) + ".         " + "%-30s%-20d%-20s%-20d%-20s", movie.movieName, movie.movieYear, movie.movieDirector,movie.movieRating,movie.available);
                System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        return counter-1;
    }

    public void returnMovie() throws IOException {
        System.out.println("Enter the movie name to be returned.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        if (returnMovie(name)) {
            System.out.println("Thank you for returning the movie");
        } else {
            System.out.println("This is not a valid movie to return");
        }
    }

    boolean returnMovie(String name) {
        Login login=new Login();
        for (Movies movie : movieList) {
            if (name.equalsIgnoreCase(movie.movieName) && !movie.available) {
                while(login.allowUserToLogin()==0) {
                    movie.available = true;
                    return true;
                }
            }
        }
        return false;
    }
}
*/