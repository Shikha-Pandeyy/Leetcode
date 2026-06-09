class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return check(nums, 0,dp);
        
    }
    public int check(int[] nums,int i, int[] dp){
        if(i>nums.length-1){
            return 0;
        }
        if(dp[i] != -1)
            return dp[i];

        int pick = nums[i]+ check(nums, i+2, dp);
        int notPick = check(nums, i+1, dp);

        return dp[i]= Math.max(pick,notPick);

        
    }
}