package com.example;

import java.util.HashMap;

public class Registration extends FeePayment {

    private final String[] courses = {
            "Digital Electronics", "Analog Electronics", "Signals and Systems",
            "Microprocessors", "Communication Systems", "EMFT", "VLSI", "Control Systems"
    };

    public void registerCourses() {
        if (getAmountPaid() == getTotalFee()) {
            HashMap<Integer, String> courseMap = new HashMap<>();
            for (int i = 0; i < courses.length; i++) {
                courseMap.put(i + 1, courses[i]);
            }
            System.out.println("You have registered in the stream " + getBranch());
            System.out.println("Registered courses: " + courseMap);
        } else {
            System.out.println("Pending amount: ₹" + getPendingAmount() + ". Please pay in full.");
        }
    }
}
