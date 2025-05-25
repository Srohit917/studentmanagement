package com.example;

public final class Adminuser extends User{
    public Adminuser(String username) {
        super(username, "Admin");
    }

    public void manageSystem(){
        System.out.println("Admin "+ getUsername() + " is managing the system.");

    }


}
