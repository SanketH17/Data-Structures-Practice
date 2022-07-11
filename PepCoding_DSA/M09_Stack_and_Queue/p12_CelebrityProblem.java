package M09_Stack_and_Queue;



/*

Sample Input
4
0 0 0 0
1 0 1 1
1 1 0 1
1 1 1 0

Sample Output
0

*/




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p12_CelebrityProblem {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

        //sc.close();
    }

    public static void findCelebrity(int[][] arr) {
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            st.push(i);
        }

        while(st.size() >= 2){
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1){
                // if i knows j --> i is not a celebrity
                st.push(j);
            }
            else{
                // if i doesn't know j --> j is not a celibrity
                st.push(i);
            }
        }

        int pot = st.pop();
        for(int i = 0; i < arr.length; i++){
            if(i != pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("none");
                    return;
                }
            }
        }

        System.out.println(pot);
    }
}



/*

Time Complexity :
On Each iteration, we are popping two elements and pushing one element back. So, what we are doing overall is reducing the number of elements in stack (potential celebrities) by 1 each time.
We will keep on reducing the size until it becomes 0 or 1. Hence the time complexity of this part of the algorithm is O(n).
After we are left with a single potential celebrity candidate, we are checking whether it is actually a celebrity or not by checking it's row and column, hence time complexity will be O(n + n) = O(2 * n).
Thus, the overall time complexity will be O(3 * n) = O(n) only.

SPACE COMPLEXITY :
We started with pushing all the elements into the stack. Hence we are using O(n) auxiliary space.

 */