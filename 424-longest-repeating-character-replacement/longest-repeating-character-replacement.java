class Solution {
    public int characterReplacement(String s, int k) {
        int res=0;
        int l=0;
        int maxf=0;
        HashMap<Character,Integer> hm =new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            maxf=Math.max(maxf,hm.get(s.charAt(i)));
            if(i-l+1-maxf>k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,i-l+1);
        }
        return res;
        
    }
}