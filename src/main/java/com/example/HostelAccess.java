package com.example;

import java.util.Scanner;

public class HostelAccess extends FeePayment implements Student.Hostel, FeePayment.HostelFee {

    @Override
    public void checkHostelStatus() {
        if (Boolean.TRUE.equals(getIsHostler())) {
            System.out.println("Student is a hostler.");
        } else {
            System.out.println("Student is a day scholar.");
        }
    }

    @Override
    public void payHostelFee() {
        if (Boolean.TRUE.equals(getIsHostler())) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter hostel fee paid: ");
            setHostelFeePaid(scanner.nextDouble());

            if (getHostelFeePaid() == getHostelFee()) {
                System.out.println("Hostel room granted.");
            } else {
                System.out.println("Remaining hostel fee: ₹" + (getHostelFee() - getHostelFeePaid()));
            }
        } else {
            System.out.println("You are a day scholar. Hostel fee not applicable.");
        }
    }
}
