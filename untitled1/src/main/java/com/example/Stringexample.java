package com.example;

import java.sql.SQLOutput;

public class Stringexample {

    public static void main (String [] args) {

    String name = "rohit";

    String name1 = "sai chandra ";

    StringBuilder sb = new StringBuilder(name);

    String reversed = sb.reverse().toString();

        System.out.println("reversed string = "+reversed);

    String s3 = name1.concat(name);

        System.out.println( "concated string = " +s3);

    String a = "rohit";
    String b = "sai";
    String c = new String("rohit");
    String d= new String("Rohit");

        System.out.println(a.compareTo(b));

    if (a == b){
        System.out.println("they are same");
    }
    else {
        System.out.println("not equal");
    }

        System.out.println( a == c);
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(d));

        String speach = "Hey everyone! So, I wanted to talk about nature. You know, the stuff outside, the things that aren't man-made? Think of the sun, the sky, the wind... that's nature! It's everywhere, and it's pretty amazing. We all need it – plants, animals, even us humans. Without nature, things would get pretty boring, pretty quickly. So, let's all appreciate the beauty and importance of the natural world!";
        System.out.println(speach.length());

        System.out.println(speach.charAt(100));
        System.out.println(speach.substring(18,47));

        String lower = speach.toLowerCase();
        String upper = speach.toUpperCase();
        System.out.println(lower);
        System.out.println(upper);

        String replace = speach.replace("t", "a");
        System.out.println(replace);
        





    }



}
