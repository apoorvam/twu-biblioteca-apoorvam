package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by apoorvam on 7/8/14.
 */
public class Menu {
    static int showMenu() throws IOException {
        System.out.println("\nMain Menu:\n");
        System.out.println("1. List all books of Library");
        System.out.println("2. List all movies of Library");
        System.out.println("3. List Available Books");
        System.out.println("4. List Available Movies");
        System.out.println("5. Return a book");
        System.out.println("6. Return a Movie");
        System.out.println("7. Login");
        System.out.println("8. User Information");
        System.out.println("9. Quit");
        System.out.println("\nEnter your choice:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
        return input;
    }


}
