package com.example;

import java.util.Scanner;

public class FeePayment extends Student {
    private double totalFee = 1000000.00;
    private double amountPaid;
    private double hostelFee = 50000.00;
    private double hostelFeePaid;

    public void collectFee() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter fee paid: ");
            double paid = scanner.nextDouble();
            setAmountPaid(paid);
        } catch (Exception e) {
            System.out.println("Invalid input.");
            setAmountPaid(0);
        }
    }

    public double getPendingAmount() {
        return totalFee - amountPaid;
    }

    public void displayPaymentDetails() {
        System.out.println("Branch: " + getBranch());
        System.out.println("Semester: " + getSem());
        System.out.println("Total Fee: ₹" + totalFee);
        System.out.println("Amount Paid: ₹" + amountPaid);
        System.out.println("Pending Amount: ₹" + getPendingAmount());
    }

    // Getters
    public double getTotalFee() { return totalFee; }
    public double getAmountPaid() { return amountPaid; }
    public double getHostelFee() { return hostelFee; }
    public double getHostelFeePaid() { return hostelFeePaid; }

    // Setters
    public void setTotalFee(double totalFee) { this.totalFee = totalFee; }
    public void setAmountPaid(double amountPaid) { this.amountPaid = amountPaid; }
    public void setHostelFee(double hostelFee) { this.hostelFee = hostelFee; }
    public void setHostelFeePaid(double hostelFeePaid) { this.hostelFeePaid = hostelFeePaid; }

    interface HostelFee {
        void payHostelFee();
    }
}
