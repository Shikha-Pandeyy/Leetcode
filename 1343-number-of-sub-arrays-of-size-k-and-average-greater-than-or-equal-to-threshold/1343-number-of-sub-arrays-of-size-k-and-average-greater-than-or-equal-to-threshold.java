class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum = 0;
        int count = 0;

        for(int i =0; i<k; i++){
            windowSum += arr[i];
        }

        if(windowSum/k >= threshold){
            count++;
        }

        for(int i=k; i<arr.length; i++){
            windowSum = windowSum + arr[i] - arr[i-k];
        

            if(windowSum/k  >= threshold){
                count++;
            }

        }
        return count;
        
        
    }
}