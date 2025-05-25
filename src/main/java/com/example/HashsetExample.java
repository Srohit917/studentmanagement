package com.example;
import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
public class HashsetExample {

    public static void main(String[] args) {
        System.out.println("\n\n=============Hash set example====================\n\n");
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Duplicate, will be ignored

        System.out.println("HashSet: " + set);

        set.remove("Banana");
        System.out.println("After removal: " + set);

        System.out.println("Contains 'Orange'? " + set.contains("Orange"));
        System.out.println("Set size: " + set.size());

        System.out.println("\n\n=============Linked set example====================\n\n");
        LinkedHashSet<String> set1 = new LinkedHashSet<>();

        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");
        set1.add("Red");  // Duplicate

        System.out.println("LinkedHashSet: " + set1);

        System.out.println("\n\n=============Tree set example====================\n\n");

        TreeSet<String> set2 = new TreeSet<>();

        set2.add("Dog");
        set2.add("Cat");
        set2.add("Elephant");
        set2.add("Cat");  // Duplicate

        System.out.println("TreeSet: " + set2);

    }
}
