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
        System.out.println("1. List Available Books");
        System.out.println("2. Return a book");
        System.out.println("3. List all books of Library");
        System.out.println("4. Quit");
        System.out.println("\nEnter your choice:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        return n;
    }


}
