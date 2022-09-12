
import java.util.*;

public class P02_HashMapIntro2 {
    public static void main(String[] args) {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap <String, Integer> map = new HashMap<>();

        // adding elements to the top
        // using standard put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        //print the size of and content of the map
        System.out.println("size of the map is : " + map.size());

        // Printing the elements in object of the map
        System.out.println(map);

        // Checking if a key is present and if
        // present, print value by passing 
        // random element
        if(map.containsKey("vishal")) {

            // Mapping
            Integer a = map.get("vishal");

            System.out.println("value of key" + " \"vishal\" is :- " + a);

        }

    }
}
