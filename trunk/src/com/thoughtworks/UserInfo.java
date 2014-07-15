package com.thoughtworks;

/**
 * Created by apoorvam on 7/15/14.
 */
public class UserInfo {
    private String libraryId;
    private String name;
    private String email;
    private String phone;
    UserInfo() { }
    UserInfo(String name, String email, String phone)
    {
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

}
