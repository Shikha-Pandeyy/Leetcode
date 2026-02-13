class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = nums[0];

        int currSum = nums[0];
        int maxSum = nums[0];

        int currmin = nums[0];
        int minSum= nums[0];

        for(int i =1; i<nums.length; i++){

        currSum = Math.max(nums[i], currSum+nums[i]);
        maxSum = Math.max(currSum, maxSum);

        currmin = Math.min(nums[i], currmin+nums[i]);
        minSum = Math.min(currmin, minSum);

        totalSum += nums[i];

        }
        if(maxSum <0)
            return maxSum;
        
        return Math.max(maxSum, totalSum-minSum);
    }
}