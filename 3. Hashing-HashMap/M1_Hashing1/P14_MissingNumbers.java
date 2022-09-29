package M1_Hashing1;

import java.util.*;

public class P14_MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hash1 = new HashMap<>();
        HashMap<Integer, Integer> hash2 = new HashMap<>();

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(hash1.containsKey(arr[i])) {
                hash1.put(arr[i], hash1.get(arr[i]) + 1);
            } else {
                hash1.put(arr[i], 1);
            }
        }


        // Taking 2nd input and making freq map for 2nd arr
        int m = sc.nextInt();
        int[] brr = new int[m];
        for(int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
            if(hash2.containsKey(brr[i])) {
                hash2.put(brr[i], hash2.get(brr[i]) + 1);
            } else {
                hash2.put(brr[i], 1);
            }
        }

        HashMap<Integer, Integer> temp = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(brr);

        // if hash2 and hash1 value are different then they are considered as missing
        // {208=1, 203=2, 204=2, 205=2, 206=2, 207=1}
        // {208=1, 203=2, 204=3, 205=3, 206=3, 207=1}

        for(int i = 0; i < m; i++) {
            if(hash2.get(brr[i]) != hash1.get(brr[i]) && !temp.containsKey(brr[i])) {
                list.add(brr[i]);
                temp.put(brr[i], 1);
            }
        }

        for(int num : list) {
            System.err.print(num + " ");
        }
        sc.close();
    }
}



/* 
TC - O(n)
SC - O(n)
*/










/*

public class P14_MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();

        int size1 = sc.nextInt();
        for(int i = 0; i < size1; i++) {
            al.add(sc.nextInt());
        }

        int size2 = sc.nextInt();
        for(int i = 0; i < size2; i++) {
            al1.add(sc.nextInt());
        }

        for(Integer num : al) {
            if(al1.contains(num)) {
                al1.remove(num);
            }
        }

        Collections.sort(al1);
        for(int i : al1) {
            System.out.print(i + " ");
        }
    }
}
 
*/