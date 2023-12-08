package accepted;

// 2574. Left and Right Sum Differences
// accepted
public class LeftAndRightSumDifference {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        int[] answer = new int[nums.length];

        if(nums.length == 1) {
            answer[0] = 0;
        } else {
            int sum = 0;

            for(int i = 0; i < nums.length; i++) {
                leftSum[i] = sum;
                sum += nums[i];
            }

            sum = 0;

            for(int i = nums.length - 1; i >= 0; i--) {
                rightSum[i] = sum;
                sum += nums[i];
            }

            for(int i = 0; i < nums.length; i++) {
                answer[i] = (leftSum[i] < rightSum[i]) ?
                        rightSum[i] - leftSum[i] :
                        leftSum[i] - rightSum[i];
            }
        }

        return answer;
    }
}
