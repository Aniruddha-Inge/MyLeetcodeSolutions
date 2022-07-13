class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            ch[indices[i]] = s.charAt(i);
        }
         StringBuilder ans = new StringBuilder();
        for(int i=0;i<ch.length;i++){
            ans.append(ch[i]);
        }
        
        return ans.toString();
    }
}