class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] != 0){
            //swapping the elements having value 0 with its next element
            int temp = nums[count];
            nums[count++] = nums[i];
            nums[i] = temp;
            }
        }
    }
}