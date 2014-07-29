package com.thoughtworks;

import java.util.*;

/**
 * Created by apoorvam on 7/16/14.
 */
public class Log {

    private Map<String,String> logbook=new HashMap<String,String>();

    private static Log _instance;


    public void show() {
        System.out.println("Item                     Library ID");
        System.out.println("------------------------------------");
        Iterator it = logbook.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.format("%-25s%10s",pairs.getKey(),pairs.getValue()+"\n");
        }
    }

    public void removeEntry(String itemToBeReturned, String currentUserId) {
        if(logbook.containsKey(itemToBeReturned))
          logbook.remove(itemToBeReturned);
    }


    public void makeEntry(String itemToBeCheckedOut, String currentUserId) {
        logbook.put(itemToBeCheckedOut,currentUserId);
    }

    public static Log get_instance(){
        if(null== _instance) {
            _instance = new Log();
        }
        return _instance;
    }
}
