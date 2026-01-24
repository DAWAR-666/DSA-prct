class Solution {
    public int romanToInt(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') cnt += 1000;
            if (s.charAt(i) == 'D') cnt += 500;
            if (s.charAt(i) == 'C'){
                if(i<s.length()-1 && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')) cnt -= 100;
                else cnt+=100;
            }
            if (s.charAt(i) == 'L') cnt += 50;
            if (s.charAt(i) == 'X'){
                if(i<s.length()-1 && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')) cnt -= 10;
                else cnt+=10;
            }
            if (s.charAt(i) == 'V') cnt += 5;
            if (s.charAt(i) == 'I'){
                if(i<s.length()-1 && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')) cnt -= 1;
                else cnt+=1;}
        }
        return cnt;
    }
}