class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int result = 0;
        if(s.length() == 1){
            return roman.get(s.charAt(0));
        }
        for(int i = 0; i < s.length(); i++){
            if((i + 1) < s.length() && roman.get(s.charAt(i)) >= roman.get(s.charAt(i + 1))){
                result += roman.get(s.charAt(i));
            } else if(i == s.length() - 1){
                result += roman.get(s.charAt(i));
            }
            if(i != 0 && (roman.get(s.charAt(i)) > roman.get(s.charAt(i - 1)))){
                result -= roman.get(s.charAt(i-1));
            }
        }
        return result;
    }
}
