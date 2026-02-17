class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0)return "";

        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int odd=checker(s,i,i);
            int even=checker(s,i,i+1);
            int max=Math.max(odd,even);
            if(max>end-start){
                start=i-(max-1)/2;
                end=i+max/2;
            }
        }
        return s.substring(start,end+1);
    }
    private int checker(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r) ){
            l--;
            r++;
        }
        return r-l-1;
    }
}