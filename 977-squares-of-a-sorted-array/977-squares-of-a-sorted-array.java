class Solution {
    public int[] sortedSquares(int[] nums) {
        // initialize a new output array with all the 0s and traverse from the right. 
        //Use 2 pointers, 1 at the start and one at the end of the nums array
        //Compare the absolute value of the elements of the nums array
        //whichever is greater add its squared value at the end of the output array and move the pointers accordingly
        
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        
        for(int i=nums.length-1; i>=0; i--){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                ans[i] = nums[start] * nums[start];
                start++;
            }
            else{
               ans[i] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }
}