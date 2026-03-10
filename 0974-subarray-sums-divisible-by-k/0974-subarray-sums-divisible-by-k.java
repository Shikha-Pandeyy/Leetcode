class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count =0;
        int prefixSum=0;

        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            
            int rmder = prefixSum%k;

            if(rmder<0){
                rmder += k;
            }

            if(map.containsKey(rmder))
                count +=map.get(rmder);

            map.put(rmder, map.getOrDefault(rmder, 0)+1);
        }
        return count;
        
    }
}