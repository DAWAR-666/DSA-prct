class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int r=0;r<s.length();r++){
            if(hm.containsKey(s.charAt(r))){
                l=Math.max(hm.get(s.charAt(r))+1,l);
            }
            hm.put(s.charAt(r),r);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}