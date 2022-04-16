class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k%nums.length;
        if(k<0) k += nums.length;
        
        reverse(nums, 0, nums.length - k -1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    void reverse(int[] a, int l, int r){
        int li = l;
        int ri = r;
        while(li < ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            
            li++;
            ri--;
        }
    }
}