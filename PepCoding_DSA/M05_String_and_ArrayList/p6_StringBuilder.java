package M05_String_and_ArrayList;


/*
 
Important Constructors of StringBuilder class

StringBuilder()           -     It creates an empty String Builder with the initial capacity of 16.
StringBuilder(String str) - 	It creates a String Builder with the specified string.
StringBuilder(int length) - 	It creates an empty String Builder with the specified capacity as length.


public StringBuilder append(String s) : It is used to append the specified string with this string. 
The append() method is overloaded like append(char), append(boolean), append(int), append(float), append(double) etc.

public StringBuilder insert(int offset, String s) :	It is used to insert the specified string with this string at the specified position. 
The insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.

public StringBuilder replace(int startIndex, int endIndex, String str) :	It is used to replace the string from specified startIndex and endIndex.

public StringBuilder delete(int startIndex, int endIndex) :	It is used to delete the string from specified startIndex and endIndex.

public StringBuilder reverse() :	It is used to reverse the string.

public int capacity() : It is used to return the current capacity.

public void ensureCapacity(int minimumCapacity)	: It is used to ensure the capacity at least equal to the given minimum.

public char charAt(int index) :	It is used to return the character at the specified position.

public int length() :	It is used to return the length of the string i.e. total number of characters.

public String substring(int beginIndex) :	It is used to return the substring from the specified beginIndex.

public String substring(int beginIndex, int endIndex) :	It is used to return the substring from the specified beginIndex and endIndex.


 */
public class p6_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello!!");

        System.out.println(sb);
        char ch = sb.charAt(0);
        System.out.println(ch);

        //sb.reverse();
        sb.setCharAt(0, 'd');
        System.out.println(sb);

        sb.insert(2,'y');
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.append('g');
        System.out.println(sb);

        int l = sb.length();
        System.out.println(l);



    }
}
