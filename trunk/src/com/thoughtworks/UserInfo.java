package com.thoughtworks;

/**
 * Created by apoorvam on 7/15/14.
 */
public class UserInfo {
    String libraryId;
    private String name;
    private String email;
    private String phone;
    UserInfo() { }

    UserInfo(String libraryId, String name, String email, String phone){
        this.libraryId=libraryId;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

    public void printAllInfo() {
        System.out.println("Name: "+this.name);
        System.out.println("Email: "+this.email);
        System.out.println("Phone: "+this.phone);
    }
}
