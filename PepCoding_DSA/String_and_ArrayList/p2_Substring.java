package PepCoding_DSA.String_and_ArrayList;

/*

s = "abcd"

0, 1 = a
0, 2 = a,b
0, 3 = a, b, c
0, 4 = a, b, c, d

1,2 = b 
1,3 = b, c
1,4 = b, c, d

2, 3 = c
2, 4 = c, d

3, 4 = d

1, 1 = _

2, 1 = error

 */

public class p2_Substring {
    public static void main(String[] args) {
        // System.out.println("original string = " + s);
        // System.out.println("substring = " + s.substring(0, 4));

        String s = "abcd";
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }

}
