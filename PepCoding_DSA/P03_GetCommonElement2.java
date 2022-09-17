
import java.util.*;

public class P03_GetCommonElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> fmap = new HashMap<>();

        // putting a1 values in freq map and updating their frequencies
        for (int val : a1) {
            if (fmap.containsKey(val)) {
                int of = fmap.get(val);
                int nf = of + 1;
                fmap.put(val, nf);
            } else {
                fmap.put(val, 1);
            }
        }

        // by using fmap we will print values from a2 
        // by checking if the val from a2 is present in a1 or not
        // if it is present then we will print the val and also
        // reduce the freq of that val from a1 by 1
        for(int val : a2) {
            if(fmap.containsKey(val) && fmap.get(val) > 0) {
                System.out.println(val);
                int of = fmap.get(val);
                int nf = of - 1;
                fmap.put(val, nf);

            }
        }
        sc.close();
    }
}
