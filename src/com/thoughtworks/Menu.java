package com.thoughtworks;

import com.sun.tools.doclets.internal.toolkit.util.SourceToHTMLConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by apoorvam on 7/8/14.
 */
public class Menu {
    static int showMenu() throws IOException {
        System.out.println("\nMain Menu:\n");
        System.out.println("1. List books of Library");
        System.out.println("2. List movies of Library");
        System.out.println("3. List Available Books and checkout");
        System.out.println("4. List Available Movies and checkout");
        System.out.println("5. Return a book");
        System.out.println("6. Return a Movie");
        System.out.println("7. Login");
        System.out.println("8. My Profile");
        System.out.println("9. Log Book");
        System.out.println("10.Logout");
        System.out.println("11.Quit");
        System.out.println("\nEnter your choice:");

        ReadInput readInput=new ReadInput();
        return readInput.readValidInput();
    }
}
