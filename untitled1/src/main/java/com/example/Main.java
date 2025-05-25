package com.example;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {


        Student student = new Student();
        student.login();

        System.out.println("name : " +student.getName());
        System.out.println("id : " +student.getId());
        System.out.println("Password : ");
        for (char c : student.getPassword()){
            System.out.print( c );
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println(" \nenter your Branch : ");
        String Sbatch = scanner.nextLine();

        System.out.println("enter your sem : ");
        int Ssem = (scanner.nextInt());

        Student s2 = new Student(Sbatch, Ssem);

        System.out.println("Branch : " + s2.getBranch());
        System.out.println("Sem : " +s2.getSem() );
        System.out.println(" enter true if you are a hostler : " +s2.getIsHostler());

        System.out.println("welcome, you have successfully logged in!!!!!!");



        HostelAccess h1 = new HostelAccess();
        h1.checkHostelStatus();
        h1.payHostelFee();

        Adminuser Adminuser = new Adminuser(student.getName());
        Adminuser.manageSystem();

        LibraryAccess l1 = new LibraryAccess();
        l1.ShowLibraryDetails();

        Registration r1 = new Registration();



        }
    }
