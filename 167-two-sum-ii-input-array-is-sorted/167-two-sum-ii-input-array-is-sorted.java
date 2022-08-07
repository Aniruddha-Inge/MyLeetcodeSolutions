class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            int sum = nums[start] + nums[end];
            
            if(sum == target){
                return new int[]{start + 1, end + 1};
            }
            if(sum < target){
                start++;
            }
            else end--;
        }
        return new int[]{start + 1, end + 1};
    }
}