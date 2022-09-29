package M1_Hashing1;

import java.util.*;

public class P03_HashMapIntro3 {
    public static void main(String[] args) {
        
        // No need to mention the 
        // generic type twice
        HashMap <Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap using generics
        HashMap <Integer, String> hm2 = new HashMap<Integer, String>();

        // Adding elements using put method
        // Custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        // Print and display mapping of HashMap 1
        System.out.println("Mappings of HashMap hm1 are : " + hm1);

        // Print and display mapping of HashMap 2 
        System.out.println("Mapping of HashMap hm2 are : " + hm2);

    }
}
