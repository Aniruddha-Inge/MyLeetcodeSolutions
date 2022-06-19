class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstElement(nums,target);
        int last = lastElement(nums,target);
        
        return new int[]{first,last};
    
    }
    static int firstElement(int[] arr,int target){
            int start = 0;
            int end = arr.length-1;
            int res = -1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target == arr[mid]){
                    res = mid;
                    end = mid-1;
                }
                else if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return res;
        }
    // return new int[]{-1,-1};
        static int lastElement(int[] arr,int target){
            int start = 0;
            int end = arr.length-1;
            int res = -1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target == arr[mid]){
                    res = mid;
                    start = mid+1;
                }
                else if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return res;
        }
    // return new int[]{-1,-1};
}