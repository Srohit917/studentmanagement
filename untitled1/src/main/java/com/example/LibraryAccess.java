package com.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LibraryAccess extends Student {
    private int BookIssued;

    public int getBookIssued(){
        return BookIssued;
    }

    public LibraryAccess(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of books issued ");
        this.BookIssued= s.nextInt();
    }

    public void ShowLibraryDetails(){
        System.out.println("Student : " +getName());
        System.out.println("Branch : " +getBranch());
        System.out.println("Book Issued : " +getBookIssued());
    }
}
