class Solution {
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long)(Math.sqrt(c));
        
        while(start <= end){
            long mid = start + (end - start)/2;
            
            long ans = start*start + end*end;
            
            if(ans == c) return true;
            else if(ans > c){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}