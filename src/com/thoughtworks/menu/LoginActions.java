package com.thoughtworks.menu;


import com.thoughtworks.Library;
import com.thoughtworks.Login;

import java.util.Arrays;

public class LoginActions implements Action {

    private Login login = new Login();

    @Override
    public boolean canHandle(int option) {
        return Arrays.asList(7, 8, 9, 10).contains(option);
    }

    @Override
    public void handle(int option) {
        boolean isUserAlreadyLoggedIn=false;
        switch (option) {
            case 7:
                if(isUserAlreadyLoggedIn!=login.isUserLoggedIn())
                    System.out.println("You are already Logged in.");
                else
                login.allowUserToLogin();
                break;
            case 8:
                login.showUserInfo();
                break;
            case 9:
                login.showLogBook();
                break;
            case 10:
                login.logout();
                break;
        }
    }
}
