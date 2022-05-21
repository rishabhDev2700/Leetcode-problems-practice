import java.util.HashSet;
import java.util.Scanner;


public class LongestSubstringWithoutDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = in.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max_count=0,start=0,end=0;
        HashSet<Character> set = new HashSet<>();
        char c;
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                max_count = Math.max(max_count,set.size());
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }

        return max_count;
    }
}
