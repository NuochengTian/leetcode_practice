/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 */
public class Solution005 {
    public static String longestPalindrome(String s) {
        String result = "";
        t:for(int j = 0; j <= s.length(); j++){
            r:for(int i = s.length(); i > j; i--){
                String t = s.substring(j, i);
                if(isPalindrome(t) && t.length() > result.length()){
                    result = t;
                    break r;
                }
                if(result.length() == s.length()){
                    break t;
                }
            }
        }
        return result;
    }

    public static boolean isPalindrome(String s){
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "acdasodnmfoaasldinfajkcjvandcabcdefghijkjihgfedcba";
        System.out.println(longestPalindrome(s));
    }
}
