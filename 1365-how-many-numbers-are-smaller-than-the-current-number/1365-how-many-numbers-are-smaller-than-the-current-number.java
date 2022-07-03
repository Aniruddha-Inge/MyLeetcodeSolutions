class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int count= 0;
        int[] countArr = new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i] > nums[j]){
                    count++;
                }    
            }
            countArr[i] = count;
            count = 0;
        }
        return countArr;
    }
}