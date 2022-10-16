package M3_Strings;

import java.util.*;;

/*
Sample Input :
6
xxhixx

Sample Output :
1


Input :
7
xhixhix

Sample Output :
2


*/

public class P04_hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
        String str = sc.next();

        int ans = solve(str);
        System.out.println(ans);
        sc.close();

    }

    public static int solve(String str) {
        if(str.length() == 1) {
            return 0;
        }      
        

        if(str.charAt(0) == 'h' && str.charAt(1) == 'i') {
             return 1 + solve(str.substring(1));
        }
        return solve(str.substring(1));
    }
}
