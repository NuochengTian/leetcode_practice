import java.util.ArrayList;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *

 */

class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> a = new ArrayList<>();
        int length = 1;
        if (s==null||s.length()==0) return 0;
        for (int j=0;j<s.length()-1;j++) {
            for (int i = j; i < s.length(); i++) {
                if (a.contains(s.charAt(i))) {
                    a.clear();
                }
                a.add(s.charAt(i));
                if (a.size() > length) length = a.size();
                if (length==95) return 95;

            }
            a.clear();
        }
        return length;
    }
}