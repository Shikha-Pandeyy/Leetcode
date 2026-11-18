class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];

        for(int i = 0; i <= n; i++) {

            if(i % 2 == 0) {
                int num = i/2;
                arr[i] = arr[num];
            }
            else {
                int num = i/2;
                arr[i] = arr[num] + 1;
            }
        }

        return arr;
    }
}