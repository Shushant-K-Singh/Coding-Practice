class Solution {
    public int maxSubArray(int[] nums) {
        int Cursum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            Cursum = Cursum+nums[i];
            maxSum = Math.max(maxSum,Cursum);
            if(Cursum<0){
                Cursum = 0;
            }
        }
        return maxSum;
    }
}
