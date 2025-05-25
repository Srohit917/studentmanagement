package com.example;
import java.security.PrivateKey;
import java.util.Scanner;

public class Student {
 private String name, id;
 private char[] Password;
 private int sem;
 private String Branch;
 protected Boolean IsHostler;
 Student (){

 }

 public Student (String Sbranch, int Ssem) {
     Branch = Sbranch;
     sem = Ssem;
 }

    void login() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter your ID: ");
        this.id = scanner.nextLine();

        System.out.println("Enter your password: ");
        String input = scanner.nextLine();
        this.Password = input.toCharArray();


    }

    interface Hostel {
        void checkHostelStatus();
    }



    public String getName(){
        return name;
    }

    public String getId() {
            return id;
    }

    public char[] getPassword() {
        return Password;
    }

    public int getSem() {return sem;}

    public String getBranch() {return Branch;}

    public Boolean getIsHostler() {return IsHostler;}
}
