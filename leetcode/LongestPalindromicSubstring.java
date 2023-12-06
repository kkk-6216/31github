class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        String result = "";
        for(int i = 0; i < s.length(); i++) {
            String sub1 = getPalindrome(s, i, i);
            String sub2 = getPalindrome(s, i, i+1);

            if(result.length() < sub1.length()) {
                result = sub1;
            }
            if(result.length() < sub2.length()) {
                result = sub2;
            }
        }

        return result;
    }

    public String getPalindrome(String s, int i, int j) {
        while (0 <= i && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(i+1, j);
    }
}