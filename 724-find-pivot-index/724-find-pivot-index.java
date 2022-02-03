class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        if(nums.length<1) return -1;
        
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        
        int sumL = 0;
        for(int i=0; i<nums.length; i++){
            sum -= nums[i];
            
            if(sum == sumL) return i;
            
            sumL += nums[i];
        }
        return -1;
    }
}