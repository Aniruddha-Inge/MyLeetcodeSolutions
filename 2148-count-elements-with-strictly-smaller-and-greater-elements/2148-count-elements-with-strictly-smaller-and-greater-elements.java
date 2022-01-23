class Solution {
    public int countElements(int[] nums) {
        int s = nums[0];
        int l = nums[0];
        
        for (int i = 0; i < nums.length; ++i) {
            s = Math.min(s, nums[i]);
            l = Math.max(l, nums[i]);
        }
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > s && nums[i] < l) {
                count++;
            }
        }
        return count;
    }
}