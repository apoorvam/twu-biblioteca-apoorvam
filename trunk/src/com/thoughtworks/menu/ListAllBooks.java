package com.thoughtworks.menu;


import com.thoughtworks.Library;
import com.thoughtworks.Login;

public class ListAllBooks implements Action {

    private Login login = new Login();

    @Override
    public boolean canHandle(int option) {
        return 1 == option;
    }

    @Override
    public void handle(int option) {

    }
}
