
import java.util.*;

public class P04_MostFrequentWordInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        HashMap<String, Integer> fmap = new HashMap<>();

        for(int i = 0; i < str.length; i++) {
            String s = str[i];
            fmap.put(s, fmap.getOrDefault(s, 0) + 1);
        }

        String ans = "";
        int maxFreq = 0;

        for(int i = 0; i < n; i++) {
            String word = str[i];
            if(fmap.get(word) >= maxFreq) {
                ans = word;
                maxFreq = fmap.get(word);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
