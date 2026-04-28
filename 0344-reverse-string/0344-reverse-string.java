class Solution {
    public void reverseString(char[] s) {
        res(s, 0, s.length-1);
        
    }

    private void res(char[] s, int left, int right){
        if(left >= right){
            return;
        }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        res(s, left+1, right-1);
    }
}