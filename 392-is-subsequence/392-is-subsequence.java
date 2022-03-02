class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        if(n>m) return false;
        
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        
        int i=0, j=0;
        while(i<n && j<m){
            if(sA[i] == tA[j]) i++;
            j++;
        }
        return i==n;
    }
}