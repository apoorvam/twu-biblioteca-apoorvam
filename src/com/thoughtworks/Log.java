package com.thoughtworks;

import java.util.*;

/**
 * Created by apoorvam on 7/16/14.
 */
public class Log {

    private static Map<String,String> logbook=new HashMap<String,String>();

    public void show() {
        System.out.println("Item                     Library ID");
        System.out.println("------------------------------------");
        Iterator it = logbook.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.format("%-30s%-20s",pairs.getKey(),pairs.getValue()+"\n");
        }
    }

    public void removeEntry(String itemToBeReturned, String currentUserId) {
        if(logbook.containsKey(itemToBeReturned))
          logbook.remove(itemToBeReturned);
    }


    public void makeEntry(String itemToBeCheckedOut, String currentUserId) {
        logbook.put(itemToBeCheckedOut,currentUserId);
    }
}
