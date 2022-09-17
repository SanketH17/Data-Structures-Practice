package M12_HashMaps;


import java.util.*;

public class P01_HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(hm.containsKey(ch)) {
                int old_freq = hm.get(ch);
                int new_freq = old_freq + 1;
                hm.put(ch, new_freq);
            } else {
                hm.put(ch, 1);
            }
        }

        char max_freq_char = str.charAt(0);
        for(Character key : hm.keySet()) {
            if(hm.get(key) > hm.get(max_freq_char)) {
                max_freq_char = key; // char with max frequency
            }
        }

        System.out.println(max_freq_char);
        sc.close();

    }
}