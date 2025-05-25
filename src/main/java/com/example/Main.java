package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create object
        HostelAccess student = new HostelAccess();

        // Login and Details
        System.out.println("=== Student Login ===");
        student.login();
        student.fillDetails();

        // Fee Payment
        System.out.println("\n=== Fee Payment ===");
        student.collectFee();
        student.displayPaymentDetails();

        // Hostel Info
        System.out.println("\n=== Hostel Access ===");
        student.checkHostelStatus();
        student.payHostelFee();

        // Course Registration
        System.out.println("\n=== Course Registration ===");
        Registration reg = new Registration();
        // Pass details from student to reg
        reg.setName(student.getName());
        reg.setBranch(student.getBranch());
        reg.setSem(student.getSem());
        reg.setAmountPaid(student.getAmountPaid());
        reg.setTotalFee(student.getTotalFee());
        reg.registerCourses();

        // Library Access
        System.out.println("\n=== Library Access ===");
        LibraryAccess lib = new LibraryAccess();
        // Pass details
        lib.setName(student.getName());
        lib.setBranch(student.getBranch());
        lib.issueBooks();
        lib.showLibraryDetails();

        System.out.println("\n=== End of Session ===");
    }
}
