class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int n = num1.length() - 1;
        int m = num2.length() - 1;
        
        while(n >= 0 || m >= 0 || carry > 0){
            int n1 = 0;
            int n2 = 0;
            
            if(n >= 0){
                n1 = num1.charAt(n) - '0';
                n--;
            }
            if(m >= 0){
                n2 = num2.charAt(m) - '0';
                m--;
            }
            int num = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) >= 10 ? 1 : 0;
            sb.append(num);
            
        }
        return sb.reverse().toString();
    }
}