package com.example;

import java.security.PrivateKey;
import java.util.Scanner;

public class FeePayment extends Student {
    private double TotalFee = 1000000.00;
    private double AmountPaid;
    private double HostelFee = 50000.00;
    protected double HostelFeePaid;


    public FeePayment() {
        super();
       Scanner s = new Scanner(System.in);
       System.out.println("enter the fee paid : ");
        this.AmountPaid = s.nextDouble();

    }


    public double getPendingAmount() {
        return TotalFee - AmountPaid;
    }

    public void displayPaymentDetails() {
        System.out.println("Branch: " + getBranch());
        System.out.println("Semester: " + getSem());
        System.out.println("Total Fee: ₹" + TotalFee);
        System.out.println("Amount Paid: ₹" + AmountPaid);
        System.out.println("Pending Amount: ₹" + getPendingAmount());
    }


    interface HostelFee {
        void payHostelFee();
    }



    public double getTotalFee (){
        return TotalFee;
    }

    public double getAmountPaid () {
        return AmountPaid;
    }

    public double getHostelFee (){
        return HostelFee;
    }

    public double getHostelFeePaid() {
        return HostelFeePaid;
    }

}
