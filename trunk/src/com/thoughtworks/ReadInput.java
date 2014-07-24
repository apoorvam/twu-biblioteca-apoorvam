package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by apoorvam on 7/24/14.
 */
public class ReadInput {

    public int readValidInput() {
        int optionChosen=99;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try {
            optionChosen = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("You've given an invalid input");
        }catch (IOException e) {
            e.printStackTrace();
        }

        return optionChosen;
    }
}
