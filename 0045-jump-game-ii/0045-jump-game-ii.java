class Solution {
    public int jump(int[] nums) {
        int maxJump =0;
        int last =0;
        int jumps=0;

        for(int i=0; i<nums.length-1; i++){
            maxJump = Math.max(maxJump,i+nums[i]);

            if(i==last){
                jumps++;
                last = maxJump;
            }
        }
        return jumps;
    }
}