package M04_Arrays_2D;



import java.util.*;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            sc.close();
        }

        /*Per row hume minimum chahiye hoga
         aur us minimum ko check karna hoga tum apne colmn mei maximum ho ya nahi
         */
        for(int i = 0; i < arr.length; i++){ // loop on all rows to find minimum in each row

            int svj = 0; // smallest value wala j
            for(int j = 1; j < arr[0].length; j++){ /*finding least value wala column*/
                if(arr[i][j] < arr[i][svj]){
                    svj = j; //updating the svj 
                }
            }

            boolean flag = true;
            for(int k = 0; k < arr.length; k++){
                if(arr[k][svj] > arr[i][svj]){ //arr[i][svj] is the least element found in the row 
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(arr[i][svj]);
                return;
            }

        }

        System.out.println("Invalid input");
        

    }
}
