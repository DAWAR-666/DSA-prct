class Solution {
    public int maxDepth(String s) {
        if(s.length()==1 || s.charAt(0)==')'){
            return 0;
        }
        int max=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
                if(cnt>=max){max=cnt;}
            }
            else if(s.charAt(i)==')'){
                cnt--;
            }
        }
        return max;
    }
}