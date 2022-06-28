class Solution {
    public int[] runningSum(int[] nums) {
        //most optimal solution
        int i=1;
        while(i < nums.length){
            nums[i] = nums[i] + nums[i-1];
            i++;
        }
        return nums;
    }
}