import java.util.*;

class Solution {

    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();

        backtrack(s, 0, result, path);

        return result;
    }

    private void backtrack(String s, int idx,
                           List<List<String>> result,
                           List<String> path) {

        if (idx == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < s.length(); i++) {

            String part = s.substring(idx, i + 1);

            if (isPalindrome(part)) {

                path.add(part);

                backtrack(s, i + 1, result, path);

                path.remove(path.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("131"));
        System.out.println(s.partition("aab"));
    }
}