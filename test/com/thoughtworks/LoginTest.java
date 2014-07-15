package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {
    @Test
    public void AuthenticationTestValid() throws Exception{
        Login login=new Login();
        assertEquals(0,login.authenticate("666-6666","abcd"));
    }
    @Test
    public void AuthenticationWrongPassword() throws Exception{
        Login login=new Login();
        assertEquals(1,login.authenticate("888-8888","fjaks"));
    }
    @Test
    public void AuthenticationWrongId() throws Exception{
        Login login=new Login();
        assertEquals(2,login.authenticate("898-6666","abcd"));
    }

}