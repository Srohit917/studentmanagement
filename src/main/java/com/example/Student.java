package com.example;

import java.util.Scanner;

public class Student {
    private String name, id;
    private int age;
    private char[] password;
    private int sem;
    private String branch;
    private Boolean isHostler;

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        setName(scanner.nextLine());

        System.out.println("Enter your ID: ");
        setId(scanner.nextLine());

        System.out.println("Enter your password: ");
        setPassword(scanner.nextLine().toCharArray());
    }

    public void fillDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        setAge(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        System.out.println("Enter your Branch: ");
        setBranch(scanner.nextLine());

        System.out.println("Enter your SEM: ");
        setSem(scanner.nextInt());

        System.out.println("Are you a hostler (true/false)? ");
        setIsHostler(scanner.nextBoolean());
    }

    // Getters
    public String getName() { return name; }
    public String getId() { return id; }
    public char[] getPassword() { return password; }
    public int getAge() { return age; }
    public int getSem() { return sem; }
    public String getBranch() { return branch; }
    public Boolean getIsHostler() { return isHostler; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = id; }
    public void setPassword(char[] password) { this.password = password; }
    public void setAge(int age) { this.age = age; }
    public void setSem(int sem) { this.sem = sem; }
    public void setBranch(String branch) { this.branch = branch; }
    public void setIsHostler(Boolean isHostler) { this.isHostler = isHostler; }

    interface Hostel {
        void checkHostelStatus();
    }
}
