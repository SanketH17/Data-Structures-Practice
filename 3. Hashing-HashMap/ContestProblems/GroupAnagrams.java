/*GroupAnagrams */

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        List<List<String>> ans = groupAnagrams(strs);
        for (List<String> l : ans) {
            for (String s : l) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            // Converting sorted char array back to String
            String temp = new String(arr);

            if (hm.containsKey(temp)) {
                // if key contains in the hashmap already
                // push it at the end of list
                hm.get(temp).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(temp, list);
            }
        }

        for (String s : hm.keySet()) {
            ans.add(hm.get(s));
        }
        return ans;
    }
}