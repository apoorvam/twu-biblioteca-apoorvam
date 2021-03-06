package com.thoughtworks;

import java.util.*;


public class Login {
    private String librarianId = "888-8888";
    private static boolean isLoggedIn = false;
    public static String currentUserId = null;
    Log log = Log.get_instance();
    private Map<String, String> usersList = new HashMap<String, String>();
    private List<UserInfo> users = new ArrayList<UserInfo>();

    public Login() {
        usersList.put("666-6666", "abcd");
        usersList.put("444-4444", "abcd");
        usersList.put("888-8888", "abcd");

        users.add(new UserInfo("666-6666", "John", "john@gmail.com", "8906785676"));
        users.add(new UserInfo("444-4444", "Swathi", "swathi@gmail.com", "9906785676"));
        users.add(new UserInfo("888-8888", "Smith(Librarian)", "smith@yahoo.com", "7987595676"));
    }


    int authenticate(String id, String password) {
        String passwordExpected;
        if (usersList.containsKey(id)) {
            passwordExpected = usersList.get(id);
        } else {
            return 2;
        }
        if (passwordExpected.matches(password))
            return 0;
        else
            return 1;
    }


    public int allowUserToLogin() {
        if (isLoggedIn)
            return 0;
        String id, password;
        id = takeInputId();
        password = takeInputPassword();
        int isAuthenticated = authenticate(id, password);
        if (isAuthenticated == 0) {
            isLoggedIn = true;
            System.out.println("Login Successfull");
            currentUserId = id;
            return 0;
        } else if (isAuthenticated == 1) {
            System.out.println("Wrong Password");
            return 2;
        } else if (isAuthenticated == 2) {
            System.out.println("User not registered");
            return 2;
        }
        return 2;
    }

    private String takeInputPassword() {
        System.out.println("Password:");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private String takeInputId() {
        System.out.println("Library number:");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void showUserInfo() {
        if (isLoggedIn) {
            for (UserInfo i : users) {
                if (i.libraryId.equals(currentUserId))
                    i.printAllInfo();
            }
        } else {
            System.out.println("You are not logged in.");
        }
    }

    public void showLogBook() {
        if (isLoggedIn && currentUserId.equals(librarianId))
            log.show();
        else
            System.out.println("You cannot see this.");
    }

    public void logout() {
        isLoggedIn = false;
        System.out.println("You are logged out");
    }

    void loginForTest() {
        isLoggedIn = true;
        currentUserId = "444-4444";
    }

    public String getCurrentUserId() {
        return currentUserId;
    }

    public boolean isUserLoggedIn() {
        return isLoggedIn;
    }
}
