class Solution {
    public boolean isPalindrome(int x) {
     
        int orig=x;
        int reverse=0;
        if(x<0 || x%10==0 && x!=0){
            return false;
        }
        while(x>0){
            int last= x%10;
            reverse=reverse*10+ last;
            x=x/10;
        }
        return orig==reverse;
    }
}