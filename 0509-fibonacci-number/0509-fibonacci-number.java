class Solution {
    public int fib(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        return check(n, arr);
        
    }
    public int check(int i, int[] arr){
        if(i==0)
            return 0;

        if(i==1)
            return 1;

        if(arr[i] != -1){
            return arr[i];
        }

        return arr[i]=check(i-1,arr)+check(i-2, arr);
    }
}