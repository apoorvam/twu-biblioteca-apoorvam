package com.thoughtworks.menu;


import java.io.IOException;

public interface Action {

    public boolean canHandle(int option);

    public void handle(int option) throws IOException;
}
