package PepCoding_DSA.Recursion_and_BackTracking.M3_Recursion_in_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

import java.util.*;

public class p2_GetKeypadCombination {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    ArrayList<String> words = getKPC(str);

    System.out.println(words);

    }
    
}
