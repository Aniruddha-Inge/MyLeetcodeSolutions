class Solution {
    public String interpret(String s) {
        StringBuilder ans = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'G'){
                ans.append('G');
            }
            else if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                ans.append('o');
                i++;
            }
            else{
                ans.append("al");
                i+=3; //"(al)" has 4 chars so i++ initial one and the next 3 below
             }
        }
        return ans.toString();
    }
}