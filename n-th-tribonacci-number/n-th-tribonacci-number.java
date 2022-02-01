class Solution {
    public int tribonacci(int n) {
        //0,1,1,2,4,7,13,24
        if(n <= 1) return n;
        if(n == 2) return 1;
        int prev3 = 0;
        int prev2 = 1;
        int prev1 = 1;
        
        for(int i=3; i<=n; i++){
            int curi = prev1 + prev2 + prev3;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = curi;
        }
        return prev1;
    }
}