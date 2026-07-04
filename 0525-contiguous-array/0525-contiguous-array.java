class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxlength =0;
        int n = nums.length;
        int sum =0;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                sum++;
            }else
                sum--;

            if(map.containsKey(sum)){
                maxlength = Math.max(maxlength, i-map.get(sum));
            }else
                map.put(sum, i);
            
        }
        return maxlength;
        
    }
}