package com.example;

import java.util.HashMap;
import java.util.Map;

public class Registration extends FeePayment{

    String[] Courses = {"Digital Electronics",
            "Analog Electronics",
            "Signals and Systems",
            "Microprocessors and Microcontrollers",
            "Communication Systems",
            "Electromagnetic Field Theory",
            "VLSI Design",
            "Control Systems"};

    Registration (){
        if (getAmountPaid() == getTotalFee()) {
        HashMap <Integer, String> map = new HashMap<>();
        for (int i = 0; i < Courses.length; i++){
            map.put(i + 1, Courses[i]);
        }
        System.out.println("you have regristerd in the Stream " +getBranch() + " ........... ");
        System.out.println("Your registered Courses are : "+ map);

        }

        else {
            System.out.println("there is still "+ getPendingAmount()+" amount of rupees pending.. please make the full payment to register.....");
        }
    }





}
