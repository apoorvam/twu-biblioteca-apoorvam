package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by apoorvam on 8/1/14.
 */
public class InputOutputStatements {

    public InputOutputStatements() {

    }

    public void outputForReturn(int returnValue, String item) {
        if (returnValue == 0)
            System.out.println("Thank you for returning the " + item);
        else if (returnValue == 1)
            System.out.println("This is not a valid " + item + " to return");
        else if (returnValue == 2)
            System.out.println("Login to perform this action");
    }

    public String inputForCheckout(String item) throws IOException {
        System.out.println("Enter the " + item + " name to be checked out:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public String inputForReturn(String item) throws IOException {
        System.out.println("Enter the " + item + " name to be returned:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public void outputForCheckout(int returnValue, String item) {
        if (returnValue == 0)
            System.out.println("Thank you! Enjoy the " + item);
        else if (returnValue == 1)
            System.out.println("That " + item + " is not available");
        else if (returnValue == 2)
            System.out.println("Login to perform this action");
    }
}
