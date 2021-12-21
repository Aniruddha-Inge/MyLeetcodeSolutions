class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int ans = 1,count = 0;
        for(int i=0;i<s.length();i++){
            int a = s.indexOf(s.charAt(i),count);
            if(a<i){
                count = a+1;
            }
            ans = Math.max(ans,i-count+1);
        }
        return ans;
    }
}