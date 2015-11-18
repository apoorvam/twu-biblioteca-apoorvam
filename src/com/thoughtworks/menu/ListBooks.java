package com.thoughtworks.menu;


import com.thoughtworks.InputOutputStatements;
import com.thoughtworks.Library;
import com.thoughtworks.Login;

import java.io.IOException;
import java.util.Arrays;

public class ListBooks implements Action {

    Library books;

    public ListBooks(Library booksList) {
        books = booksList;
    }

    InputOutputStatements ioStatements = new InputOutputStatements();

    @Override
    public boolean canHandle(int option) {
        return Arrays.asList(1,3,5).contains(option);
    }

    @Override
    public void handle(int option) throws IOException {
        if(option==1)
           books.listAllBooks();
        else if(option==3){
           books.listAvailableBooks();
           ioStatements.outputForCheckout(books.checkoutItem(ioStatements.inputForCheckout("book")), "book");
        }
        else if(option==5){
            ioStatements.outputForReturn(books.returnItem(ioStatements.inputForReturn("book")), "book");
        }
    }
}
