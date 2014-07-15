package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by apoorvam on 7/15/14.
 */
public class MovieStoreTest {
    @Test
    public void checkoutMovie() throws Exception{
        assertEquals(true, new MovieStore().checkoutMovie("Lagaan"));
    }
    @Test
    public void checkoutInvalidMovie() throws Exception{
        assertEquals(false, new MovieStore().checkoutMovie("Heropanti"));
    }
    @Test
    public void checkoutMovieWithCaseSensitive() throws Exception{
        assertEquals(true, new MovieStore().checkoutMovie("LagAan"));
    }
    @Test
    public void checkoutMovieWithSpaces() throws Exception{
        assertEquals(false, new MovieStore().checkoutMovie("Humshakals"));
    }
    @Test
    public void listMovies() throws Exception{
        assertEquals(3,new MovieStore().listAvailableMovies());
    }
    @Test
    public void listMoviesWithOneAddedTrue() throws Exception{
        MovieStore movie=new MovieStore();
        movie.movieList.add(new Movies("Dhoom",2014,"Sanjay Gadhvi",7,true));
        assertEquals(4, movie.listAvailableMovies());
    }
    @Test
    public void listMoviesWithOneAddedFalse() throws Exception{
        MovieStore movie=new MovieStore();
        movie.movieList.add(new Movies("2 States",2014,"Abhishek verman",7,false));
        assertEquals(3, new MovieStore().listAvailableMovies());
    }
    @Test
    public void returnMovie() throws Exception{
        MovieStore movie=new MovieStore();
        movie.checkoutMovie("Golmal");
        assertTrue(movie.returnMovie("Golmal"));
    }
    @Test
    public void returnMoviePresent() throws Exception{
        MovieStore movie=new MovieStore();
        assertFalse(movie.returnMovie("Golmal"));
    }
    @Test
    public void returnInvalidMovie() throws Exception{
        MovieStore movie=new MovieStore();
        assertFalse(movie.returnMovie("3 Idiots"));
    }


}
