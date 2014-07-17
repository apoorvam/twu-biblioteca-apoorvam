package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by apoorvam on 7/15/14.
 */
public class MovieStoreTest {
    Library moviesT=new Library();
    Login login= new Login();

    void initialize(){
        login.loginForTest();
        moviesT.items.add(new Movies("Lagaan",2001,"Asuthosh",7,true));
        moviesT.items.add(new Movies("Golmal", 2010, "Rohit Shetty", 4, true));
        moviesT.items.add(new Movies("Krish", 2013, "Rakesh Roshan", 10, true));
    }
    void initializelist(){
        moviesT.items.add(new Movies("Lagaan",2001,"Asuthosh",7,true));
        moviesT.items.add(new Movies("Golmal", 2010, "Rohit Shetty", 4, true));
        moviesT.items.add(new Movies("Krish", 2013, "Rakesh Roshan", 10, true));
    }

    @Test
    public void checkoutMovie() throws Exception{
        initialize();
        assertEquals(0, moviesT.checkoutItem("Lagaan"));
    }
    @Test
    public void checkoutInvalidMovie() throws Exception{
        initialize();
        assertEquals(1, moviesT.checkoutItem("Heropanti"));
    }
    @Test
    public void checkoutMovieWithCaseSensitive() throws Exception{
        initialize();
        assertEquals(0, moviesT.checkoutItem("LagAan"));
    }
    @Test
    public void checkoutMovieWithSpaces() throws Exception{
        initialize();
        assertEquals(1, moviesT.checkoutItem("Krish  "));
    }
    @Test
    public void listMovies() throws Exception{
        initializelist();
        assertEquals(3,moviesT.listAvailableMovies());
    }
    @Test
    public void listMoviesWithOneAddedTrue() throws Exception{
        initializelist();
        moviesT.items.add(new Movies("Dhoom",2014,"Sanjay Gadhvi",7,true));
        assertEquals(4, moviesT.listAvailableMovies());
    }
    @Test
    public void listMoviesWithOneAddedFalse() throws Exception{
        initializelist();
        moviesT.items.add(new Movies("2 States",2014,"Abhishek verman",7,false));
        assertEquals(3, moviesT.listAvailableMovies());
    }
    @Test
    public void returnMovie() throws Exception{
        initialize();
        moviesT.checkoutItem("Golmal");
        assertEquals(0,moviesT.returnItem("Golmal"));
    }
    @Test
    public void returnMoviePresent() throws Exception{
        initialize();
        assertEquals(1,moviesT.returnItem("Golmal"));
    }
    @Test
    public void returnInvalidMovie() throws Exception{
        initialize();
        assertEquals(1,moviesT.returnItem("3 Idiots"));
    }

}
