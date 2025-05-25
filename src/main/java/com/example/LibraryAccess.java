package com.example;

import java.util.Scanner;

public class LibraryAccess extends Student {

    private int bookIssued;

    public void issueBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of books issued: ");
        setBookIssued(scanner.nextInt());
    }

    public void showLibraryDetails() {
        System.out.println("Student: " + getName());
        System.out.println("Branch: " + getBranch());
        System.out.println("Books Issued: " + getBookIssued());
    }

    // Getter
    public int getBookIssued() { return bookIssued; }

    // Setter
    public void setBookIssued(int bookIssued) { this.bookIssued = bookIssued; }
}
