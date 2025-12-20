class Solution {
    public String reverseWords(String s) {
        String[] x=s.trim().split(" ");
        String y="";
        for(int i=x.length-1;i>=0;i--){
            if(x[i]==""){
                continue;
            }
            y+=x[i];
            y+=" ";            
        }
        y=y.trim();
        return y;
    }
}