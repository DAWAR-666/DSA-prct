class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length()==1){
            return s;
        }
        String x="";
        
        int open=0;
        for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
            if (c == '(') {
               if (open > 0) x=x+c;
                open++; 
            } else {
                open--; 
                if (open > 0) x=x+c;
            }
            
        }
        return x;   
    }
}