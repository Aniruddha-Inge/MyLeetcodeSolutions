class Solution {
    public int searchInsert(int[] nums, int target) {
        int max = nums[nums.length-1];
        int min = nums[0];
        
        if(target > max){
            return nums.length;
        }
        else if(target < min){
            return 0;
        }
        int res = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                res = mid;
                end = mid-1;
            }
        }
        return res;
    }
}