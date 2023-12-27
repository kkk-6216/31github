class Solution {
    
    public int minCost(String colors, int[] neededTime) {
        int time = 0;

        int max = neededTime[0];
        int sum = 0;
        char ch = colors.charAt(0);
        int count = 0;

        for(int i = 1; i < colors.length(); i++) {
            if(colors.charAt(i) == ch) {
                int temp = max;
                max = Math.max(neededTime[i], max);
                sum += (max > temp) ? temp : neededTime[i];
            } else {
                if(sum > 0) {
                    time += sum;
                }
                sum = 0;
                max = neededTime[i];
                ch = colors.charAt(i);
            }
        }

        return (sum > 0) ? time + sum : time;
    }
}
