class Solution {
    public boolean isPalindrome(int x) {

        int temp = 0;
        int num=x;

        if(x<0)
            return false;

        while(x>0){

            temp= temp*10+x%10;

            x=x/10;


        }
        if(num==temp)
            return true;

        return false;

    }
}
