class Solution {
    public int climbStairs(int n) {
        return rec(0,n);
    }

    public int rec(int ind,int n){
       if(ind > n){
        return 0;
       }

       if(ind == n){
        return 1;
       }

       int one=rec(ind+1,n);
       int two=rec(ind+2,n);

       return one + two;
    }
}
