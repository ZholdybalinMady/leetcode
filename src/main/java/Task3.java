import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        String s = "asjrgapa";
        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {

        //TODO REDO brut force
        int max = 0;
        char[] chars = s.toCharArray();
        String longString = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (longString.indexOf(chars[j]) >= 0) {
                    longString = "";
                    break;
                } else {
                    longString = longString + chars[j];
                    max = Math.max(max, longString.length());
                }
            }
        }

        return max;
    }
}
