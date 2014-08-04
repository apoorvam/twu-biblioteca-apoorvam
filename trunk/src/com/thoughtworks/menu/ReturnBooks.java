package com.thoughtworks.menu;

import com.thoughtworks.InputOutputStatements;
import com.thoughtworks.Library;

import java.io.IOException;

/**
 * Created by apoorvam on 8/1/14.
 */
public class ReturnBooks implements Action{
    Library books;
    public ReturnBooks(Library booksList) {
        books = booksList;
    }

    public InputOutputStatements ioStatments=new InputOutputStatements();

    @Override
    public boolean canHandle(int option) {
        return 5==option;
    }

    @Override
    public void handle(int option) throws IOException {
        ioStatments.outputForReturn(books.returnItem(ioStatments.inputForReturn("book")), "book");
    }
}
