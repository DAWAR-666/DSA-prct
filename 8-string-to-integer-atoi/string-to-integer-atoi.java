class Solution {
    public int myAtoi(String s) {
        
        String x=s.strip();
        if(x.length()==0)return 0;
        double ans=0;
        boolean negative=false;
        int i=0;
        if(x.charAt(0)=='-') {negative=true;i=1;}
        if(x.charAt(0)=='+') i=1; 
        while(i<x.length()){
            if(Character.isDigit(x.charAt(i))){
                ans*=10;
                ans+=Character.getNumericValue(x.charAt(i));
            }
            else break;
            i++;
        }
        if(negative) ans=-ans;
        if(ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)ans;
    }
}