package ProblemSolving.M3_Strings;

import java.util.*;

public class P08_RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.nextLine();

        String[] romanInts = str.split("\\s");
        // romanInts[] = ["XII", "XXVII", "LX"]

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            int num = 0;
            int last = 0;
            int n = 0;
            for (int j = romanInts[i].length() - 1; j >= 0; j--) {

                char c = romanInts[i].charAt(j);

                switch (c) {
                    case 'I':
                        n = 1;
                        break;
                    case 'V':
                        n = 5;
                        break;
                    case 'X':
                        n = 10;
                        break;
                    case 'L':
                        n = 50;
                        break;
                    case 'C':
                        n = 100;
                        break;
                    case 'D':
                        n = 500;
                        break;
                    case 'M':
                        n = 1000;
                        break;
                    default:
                        n = 0;
                }

                if (last > n) {
                    num = num - n;
                } else {
                    num = num + n;
                }
                last = n;
            }
            ans[i] = num;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();

    }
}
