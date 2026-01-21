class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reversed=0;
        int temp = x;
        while(x!=0){
            int lastDigit = x%10;
            reversed = (reversed*10)+lastDigit;
            x=x/10;
        }
        if(reversed == temp) return true;
        else return false;
    }
}