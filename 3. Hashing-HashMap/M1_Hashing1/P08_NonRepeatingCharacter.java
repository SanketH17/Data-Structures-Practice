import java.util.*;

public class P08_NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> fmap = new HashMap<>();

        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(fmap.get(ch) == 1) {
                System.out.println(ch);
                return;
            }
        }
        
    }
}
