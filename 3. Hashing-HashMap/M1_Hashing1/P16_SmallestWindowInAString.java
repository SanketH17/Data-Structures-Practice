package M1_Hashing1;

import java.util.*;

public class P16_SmallestWindowInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        String ans = getSmallestWindow(s, p);
        System.out.println(ans);
        sc.close();
    }

    public static String getSmallestWindow(String s, String p) {
        int n = s.length();
        int m = p.length();

        // 1. To make a freq map for p
        HashMap<Character, Integer> pMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            char ch = p.charAt(i);
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        String ans = "";
        int rel = -1; // release
        int acq = -1; // acquire

        // 1 Make Smap
        HashMap<Character, Integer> sMap = new HashMap<>();
        int matchCount = 0;
        int desiredMatchCnt = m; // same as the length of p

        while (true) {
            boolean isAcquired = false;
            // acquire new char
            while (acq < n - 1 && matchCount < desiredMatchCnt) {
                isAcquired = true;

                acq++;
                char acqChar = s.charAt(acq);
                sMap.put(acqChar, sMap.getOrDefault(acqChar, 0) + 1);

                // do we get good amount of matchcount or desiredmatch count
                if (sMap.get(acqChar) <= pMap.getOrDefault(acqChar, 0)) {
                    matchCount++;
                }

            }

            boolean isReleased = false;
            // update answer and release unwanted stuff from the beg
            while (rel < acq && matchCount == desiredMatchCnt) {
                isReleased = true;

                String currAns = s.substring(rel + 1, acq + 1); // in substring bet to last index but not included the
                if (ans.length() == 0 || ans.length() > currAns.length()) {
                    ans = currAns;
                } // last index
                rel++;
                char relChar = s.charAt(rel);
                if (sMap.get(relChar) == 1) {
                    sMap.remove(relChar);
                } else {
                    sMap.put(relChar, sMap.get(relChar) - 1);
                }

                if (pMap.containsKey(relChar) == true) {
                    if (sMap.containsKey(relChar) == false) {
                        matchCount--;
                    } else if (sMap.get(relChar) < pMap.get(relChar)) {
                        matchCount--;
                    }
                }
            }

            if (isAcquired == false && isReleased == false) {
                break;
            }
        }

        return ans;
    }

}
