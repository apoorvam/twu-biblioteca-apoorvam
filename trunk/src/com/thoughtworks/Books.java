package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apoorvam on 7/8/14.
 */
public class Books {
    public String bookTitle;
    public String bookAuthor;
    public int bookPublicationYear;
    public boolean available;

    Books(){}
    Books(String title, String author, int year, boolean available)
    {
        this.bookTitle=title;
        this.bookAuthor=author;
        this.bookPublicationYear=year;
        this.available=available;
    }
}