class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 2) return false;
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}