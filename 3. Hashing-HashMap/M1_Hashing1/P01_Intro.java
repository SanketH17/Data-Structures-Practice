
import java.util.*;

public class P01_Intro {
    public static void main(String[] args) {
        System.out.println("\n");

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 1391);
        hm.put("China", 1398);
        hm.put("USA", 329);
        hm.put("Indonesia", 268);

        // Printing the get(key) when key exists
        System.out.println("Value for India " + hm.get("India"));

        // Printing the get(key) when kkey doesn't exist
        System.out.println("Value for Utopia " + hm.get("Utopia"));

        // Contains a key in a HashMap
        // TC - O(1)
        /*
         This is a Boolean function. We pass a particular key value as a parameter to this function. 
         If the hashmap contains that key, it returns true else it returns false. So, let us implement it:
        */

        System.out.println("The hashMap contains China : " + hm.containsKey("China"));
        System.out.println("The HashMap contains Pakistan : " + hm.containsKey("Pakistan"));
        
        Set <String> keys = hm.keySet();
        System.out.print(keys + " ");
        System.out.println();


        // Java Code (Implementation of keySet())

        for(String key : hm.keySet()) {
            Integer val = hm.get(key);
            System.out.print(key + " : " + val + " ");
        }
        
        System.out.println("\n");
    
    }
}
