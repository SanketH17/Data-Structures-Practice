package M03_Functions_and_Arrays;

import java.util.Scanner;

public class nPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);
        int nmfact = fact(n - r);

        int npr = nfact / nmfact ;

        display(n, r, npr);
        sc.close();
    }

    public static int fact(int n){
        int rv = 1;

        for(int i = 1; i <= n; i++){
            rv = rv * i;
        }

        return rv;
    }
    public static void display(int n, int r, int npr) {
        System.out.println(n + "P" + r + " = " + npr);
        
    }
}

/*
 


 */