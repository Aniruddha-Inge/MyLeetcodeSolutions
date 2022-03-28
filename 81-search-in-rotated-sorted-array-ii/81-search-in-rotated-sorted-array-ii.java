class Solution {
    public boolean search(int[] nums, int target) {
        
        int n = nums.length;
        int low = 0, high = n-1, mid=0;
        
        while(low<=high)
        {
            mid = (low+high)/2;
        
            if(nums[mid] == target)
                return true;
            
            if(nums[low] == nums[mid] && nums[mid] == nums[high])
            {
                low += 1;
                high -= 1;
            }
            
            else if(nums[mid]>target)
            {
                
                if(nums[low]<=nums[mid] && nums[low]>target) 
                    low = mid+1;
                else
                    high = mid-1;
            }
            
            else
            {
                
                if(nums[high] >=nums[mid] && nums[high]<target) 
                    high = mid-1;
                else
                    low = mid+1;
            }
             
            
        }
        
        return false;
    }
}