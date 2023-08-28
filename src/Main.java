public class Main {
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        String sub = s.substring(0,1);
        int max = 1;
        int temp_index;
        for (int i = 1; i < s.length(); i++) {
            temp_index = sub.indexOf(s.charAt(i));
            if (temp_index > -1) {
                if (max < sub.length()) max = sub.length();
                sub = sub.substring(temp_index + 1);
                // System.out.println("YES " + sub);
            }
            sub = sub + s.charAt(i);
            // System.out.println(sub);
        }
        if (max < sub.length()) max = sub.length();
        return max;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}