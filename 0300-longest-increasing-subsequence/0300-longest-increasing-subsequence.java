class Solution {
    int n;
    public int lengthOfLIS(int[] nums) 
    {
        n=nums.length;
        int dp[][]=new int[n][n+1];

        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return helper(nums,0,-1,dp);
    }
    public int helper(int[] nums,int i,int prev,int[][] dp)
    {
        if(i==nums.length)
            return 0;

        if( dp[i][prev+1]!=-1) return dp[i][prev+1];

        int pick=0;int nt= nt=helper(nums,i+1,prev,dp);

        if(prev==-1||nums[prev]<nums[i])
        {
            pick=1+helper(nums,i+1,i,dp);
        }
           
        
        return dp[i][prev+1]=Math.max(pick,nt);
    }

}