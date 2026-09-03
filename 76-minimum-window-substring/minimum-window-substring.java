class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()||s.length()<t.length()) return "";
        HashMap <Character,Integer>window=new HashMap<>();
        HashMap <Character,Integer>count=new HashMap<>();
        for(char c:t.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        int l=0;
        int[] range={-1,-1};
        int minLength=Integer.MAX_VALUE;
        int have=0;
        
        int need=count.size();
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (count.containsKey(c) && window.get(c).equals(count.get(c))) {
                have++;
            }
            while(have==need){
                if(r-l+1<minLength){
                    minLength=r-l+1;
                    range[0]=l;
                    range[1]=r;
                }
                char leftChar=s.charAt(l);
                window.put(leftChar,window.get(leftChar)-1);
                if(count.containsKey(leftChar)&&window.get(leftChar)<count.get(leftChar)){
                    have--;
                }
                l++;
            }
        }

        return minLength==Integer.MAX_VALUE?"":s.substring(range[0],range[1]+1);
    }
}