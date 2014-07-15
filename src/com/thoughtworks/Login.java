package com.thoughtworks;

import java.util.*;

/**
 * Created by apoorvam on 7/15/14.
 */
public class Login{
    private static boolean isLoggedIn=false;
    private Map<String,String> usersList=new HashMap<String, String>();

    Login()
    {
        usersList.put("666-6666","abcd");
        usersList.put("444-4444","abcd");
        usersList.put("888-8888","abcd");
        new UserInfo("John","john@gmail.com","8906785676");
        new UserInfo("Swathi","swathi@gmail.com","9906785676");
        new UserInfo("Smith","smith@yahoo.com","7987595676");
    }
    int authenticate(String id, String password)
    {
        String passwordExpected;
        if(usersList.containsKey(id)) {
            passwordExpected = usersList.get(id);
            //System.out.println("" + passwordExpected);
        }
        else {
            System.out.println("User not registered");
            return 2;
        }
        if(passwordExpected.matches(password))
            return 0;
        else
            return 1;
    }


    public int allowUserToLogin() {
        if(isLoggedIn==true)
            return 0;
        System.out.println("Library number:");
        Scanner input=new Scanner(System.in);
        String id=input.nextLine();
        System.out.println("Password:");
        String password=input.nextLine();
        int isAuthenticated=authenticate(id,password);
        if(isAuthenticated==0) {
            isLoggedIn = true;
            System.out.println("Login Successfull");
            return 0;
        }
        else if(isAuthenticated==1){
            //System.out.println("Wrong Password. Login again to do transaction");
            return 1;
        }
        else if(isAuthenticated==2){
            //System.out.println("Login with a registered id.");
            return 2;
        }
        return 2;
    }
}
