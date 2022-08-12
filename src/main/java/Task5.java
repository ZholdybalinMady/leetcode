public class Task5 {

    public static void main(String[] args) {
        longestPalindrome("bbd");
    }


    public static String longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        int resLen = 0;
        String res = "";
        for (int i = 0; i < chars.length; i++) {


            int l = i;
            int r = i;
            while (l >= 0 && r < chars.length && chars[l] == chars[r]) {
                if (r - l + 1 > resLen) {
                    resLen = r - l + 1;
                    res =  s.substring(l, r + 1);
                }
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r < chars.length && chars[l] == chars[r]) {
                if (r - l + 1 > resLen) {
                    resLen = r - l + 1;
                    res =   s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }
        return res;

    }
}
