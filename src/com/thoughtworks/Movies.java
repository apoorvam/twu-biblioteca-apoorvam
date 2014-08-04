package com.thoughtworks;

/**
 * Created by apoorvam on 7/15/14.
 */
public class Movies implements Item {
    public String movieName;
    public int movieYear;
    public String movieDirector;
    public int movieRating;
    public boolean available;

    Movies(String movieName, int movieYear, String movieDirector, int movieRating, boolean available) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
        this.available = available;
    }

    @Override
    public boolean matchesForCheckout(String query) {
        return this.movieName.equalsIgnoreCase(query) && this.available;
    }

    @Override
    public boolean matchesForReturn(String query) {
        return this.movieName.equalsIgnoreCase(query) && !(this.available);
    }

    @Override
    public void returnItem() {
        this.available = true;
    }

    @Override
    public void checkoutItem() { this.available=false; }
    @Override
    public void printWithoutAvailability(int counter){
        System.out.format(counter + ".         " + "%-30s%-20d%-20s%-20d", this.movieName, this.movieYear, this.movieDirector, this.movieRating);
        System.out.println();
    }
    @Override
    public void printWithAvailability(int counter){
        System.out.format(counter+".         " + "%-30s%-20d%-20s%-20d%-20s", this.movieName, this.movieYear, this.movieDirector,this.movieRating,(this.available) ? "Yes" : "No");
        System.out.println();
    }

    @Override
    public boolean checkAvailability() {
        return this.available;
    }

}
