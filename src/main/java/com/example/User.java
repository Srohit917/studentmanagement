package com.example;

public sealed class User permits Adminuser{

    protected String username;
    protected String role;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername(){
        return username;
    }

    public String getRole(){
        return role;
    }

    public void displayinfo() {
        System.out.println("username : " + username);
        System.out.println("role : " +role);
    }


}
