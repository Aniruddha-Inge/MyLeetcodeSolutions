class Solution {
    public int findDuplicate(int[] nums) {
        // we can solve this question with 2 methods
        //1st one is cyclic sort since given integer range in 1 to n
        //2nd method is slow fast pointers (same as LinkedList)
        
        int i=0;
        while(i<nums.length){
            
            if(nums[i] != i+1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }
                else return nums[i];
            } else i++;
            
        }
        return -1;
    }
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}