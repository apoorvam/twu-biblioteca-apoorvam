package com.thoughtworks.menu;


public interface Action {

    public boolean canHandle(int option);

    public void handle(int option);
}
