package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apoorvam on 7/8/14.
 */
public class Books implements Item {
    public String bookTitle;
    public String bookAuthor;
    public int bookPublicationYear;
    public boolean available;

    Books() {
    }

    Books(String title, String author, int year, boolean available) {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.bookPublicationYear = year;
        this.available = available;
    }

    @Override
    public boolean matchesForCheckout(String query) {
        return this.bookTitle.equalsIgnoreCase(query) && this.available;
    }

    @Override
    public void returnItem() {
        this.available = true;
    }

    @Override
    public void checkoutItem() {
        this.available = false;
    }

    @Override
    public boolean matchesForReturn(String query) {
        return this.bookTitle.equalsIgnoreCase(query) && !(this.available);
    }


    @Override
    public void printWithoutAvailability(int counter) {
        System.out.format(counter + ".     " + "%-30s%-30s%-6d", this.bookTitle, this.bookAuthor, this.bookPublicationYear);
        System.out.println();
    }
    @Override
    public void printWithAvailability(int counter){
        System.out.format(counter+".     " + "%-30s%-30s%-4d%25s", this.bookTitle, this.bookAuthor, this.bookPublicationYear, (this.available == true) ? "Yes" : "No");
        System.out.println();
    }
    @Override
    public boolean checkAvailability() {
        if(this.available == true) return true;
        return false;
    }
}
