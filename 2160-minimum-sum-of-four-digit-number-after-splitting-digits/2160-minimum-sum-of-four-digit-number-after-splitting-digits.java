class Solution {
    public int minimumSum(int num) {
        int[] ans = new int[4];
        int i=0;
        while(num != 0){
            ans[i] = num%10;
            num/=10;
            i++;
        }
        Arrays.sort(ans);
        
        int new1 = ans[0]*10 + Math.max(ans[2], ans[3]);
        int new2 = ans[1]*10 + Math.min(ans[2], ans[3]);
        
        return new1 + new2;
    }
}