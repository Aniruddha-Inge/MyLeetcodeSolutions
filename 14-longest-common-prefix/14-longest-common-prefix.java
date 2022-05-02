class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String temp = "";
        // ans = ans.trim();
        outer : for(int i  = 0; i < strs[0].length(); i++){
            temp += strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(!strs[j].startsWith(temp)){
                    break outer;
                }
            }
            ans = temp;
        }
        return ans;
    }
}