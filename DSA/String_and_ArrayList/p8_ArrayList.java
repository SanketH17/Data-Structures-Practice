package PepCoding_DSA.String_and_ArrayList;

/*

Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit.

The ArrayList in Java can have the duplicate elements also.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because the array works on an index basis.
In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur
if any element is removed from the array list.


We can not create an array list of the primitive types, such as int, float, char, etc. 
It is required to use the required wrapper class in such cases. 
For example:
ArrayList<int> al = ArrayList<int>(); // does not work  
ArrayList<Integer> al = new ArrayList<Integer>(); // works fine  

Java ArrayList gets initialized by the size. The size is dynamic in the array list, 
which varies according to the elements getting added or removed from the list.

void add(int index) : To insert elements in the ArrayList
void add(int index, E element) : 	It is used to insert the specified element at the specified position in a list.
boolean add(E e) : It is used to append the specified element at the end of a list.
void clear() : It is used to remove all of the elements from this list.
E get(int index) : It is used to fetch the element from the particular position of the list.
boolean isEmpty() : It returns true if the list is empty, otherwise false.
set(int index, E element) : Replaces the element at the specified position in this list with the specified element.
 */


 import java.util.*;

public class p8_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list + " -> " + list.size());

        list.add(10);
        System.out.println(list + " -> " + list.size());
        list.add(20);
        System.out.println(list + " -> " + list.size());
        list.add(20);
        System.out.println(list + " -> " + list.size());
        list.add(30);
        System.out.println(list + " -> " + list.size());

        list.add(1, 150);
        System.out.println(list + " -> " + list.size());

        int val = list.get(2);
        System.out.println("Value at index 2 : " + val);

        list.set(2, 250); // dont use list[2] = 250 to set/change the value at a specified location 
        System.out.println(list + " -> " + list.size());

        list.remove(0);
        System.out.println(list + " -> " + list.size());

        System.out.println();
        System.out.println("String Arraylist : ");
        System.out.println();

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Sanket");
        l2.add("JD");
        l2.add("Lamba");
        l2.add("Aditya");
        System.out.println(l2 + " -> " + l2.size());
        System.out.println();


        System.out.println("Simple for loop : ");
        for(int i = 0; i < list.size(); i++){
            int item = list.get(i);
            System.out.println(item);
        }

        System.out.println("For Each Loop");
        //for each loop :
        for(int item : list){
            System.out.println(item);
        }

        System.out.println("Simple ArrayList Printing : ");
        System.out.println(list);
    }
}
