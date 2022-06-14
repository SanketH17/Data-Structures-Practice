package PepCoding_DSA.String_and_ArrayList;


/*

String [ ] split ( String regex, int limit )
Parameters:

regex – a delimiting regular expression
Limit – the resulting threshold
Returns: An array of strings is computed by splitting the given string.

Throws: PatternSyntaxException – if the provided regular expression’s syntax is invalid.  

The limit parameter can have 3 values: 

limit > 0 – If this is the case, then the pattern will be applied at most limit-1 times, the resulting array’s length will not be more than n, and the resulting array’s last entry will contain all input beyond the last matched pattern.
limit < 0 – In this case, the pattern will be applied as many times as possible, and the resulting array can be of any size.
limit = 0 – In this case, the pattern will be applied as many times as possible, the resulting array can be of any size, and trailing empty strings will be discarded.

 */

public class p4_Split {
    public static void main(String[] args) {
        String s = "abc def gfi jklm";

        String[] parts = s.split("i"); // array of strings which stores different parts of string in the form of arrays
    
        for(int i = 0; i < parts.length; i++){
            System.out.println(parts[i]);
        }



    }
    
}
