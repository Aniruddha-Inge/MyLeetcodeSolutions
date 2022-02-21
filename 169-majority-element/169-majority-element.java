class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=0;
        int i=0;
		
        while(i<nums.length)
        {
            if(count==0)
            {
                ele=nums[i];
            }
            if(ele==nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            i++;
        }
        return ele;
    }
}