package com.example;

import java.util.Scanner;

public class HostelAccess extends FeePayment implements Student.Hostel, FeePayment.HostelFee  {

    @Override
    public void checkHostelStatus() {
        if (getIsHostler()==true) {
            System.out.println("Student is a hostler.");
        } else {
            System.out.println("Student is a day scholar.");
        }
    }

    @Override
    public void payHostelFee() {
        if (getIsHostler()==true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter hostel fee paid: ");
            this.HostelFeePaid = s.nextDouble();

            if (getHostelFeePaid() == getHostelFee()) {
                System.out.println("Hostel room granted.");
            } else {
                System.out.println("Please pay the remaining hostel fee of ₹" + (getHostelFee() - getHostelFeePaid()));
            }
        } else {
            System.out.println("Hostel fee not applicable. You are a day scholar.");
        }
    }


}
