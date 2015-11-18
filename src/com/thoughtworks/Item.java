package com.thoughtworks;

/**
 * Created by apoorvam on 7/15/14.
 */
public interface Item {

    boolean matchesForReturn(String query);
    boolean matchesForCheckout(String query);

    void returnItem();
    void checkoutItem();

    public void printWithoutAvailability(int counter);
    public void printWithAvailability(int counter);

    public boolean checkAvailability();
}
