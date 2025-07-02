class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] f1=getfreq(s);
        int[] f2=getfreq(t);
        return Arrays.equals(f1,f2);
    }
    private int[] getfreq(String str){
        int[] freq=new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        
        return freq;
    }
}