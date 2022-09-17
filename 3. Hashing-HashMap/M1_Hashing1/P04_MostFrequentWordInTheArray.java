
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
            if(fmap.containsKey(str[i])) {
                int of = fmap.get(str[i]);
                int nf = of + 1;
                fmap.put(str[i], nf);
            } else {
                fmap.put(str[i], 1);
            }
        }

        int max = 0;
        for(String key : fmap.keySet()) {
            //if()
        }

    }
}
