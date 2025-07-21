class Solution {
    public int i=0;
    public void reverseString(char[] s) {
        if(i>=s.length/2){
            return;
        }
        char x=s[i];        
        s[i]=s[s.length-i-1];
        s[s.length-i-1]=x;
        i++;
        reverseString(s);
    }
}